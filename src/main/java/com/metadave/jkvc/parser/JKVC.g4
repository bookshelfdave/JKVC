grammar JKVC;

/*
 * -------------------------------------------------------------------
 *
 *   Copyright (c) 2013 Dave Parfitt
 *
 *   This file is provided to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License.  You may obtain
 *   a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 * -------------------------------------------------------------------
 */

// foo.bar.@i[2:5]
// data.@i[0].value.bookmarks.@i[0].url

path: path_element+;

path_element: simple_target |
              aggregate_fun |
              index_ref |
              index_range |
              method_call;
                      
simple_target: target=ID;

aggregate_fun: AT funid=ID;           

index_ref: AT I LSQUARE idx=INT RSQUARE ;          

index_range: AT I LSQUARE idx0= INT COLON idx1=INT RSQUARE;

method_call: HASH methodName=ID;

LSQUARE:       '[';
RSQUARE:       ']';
HASH:          '#';
COLON:         ':';
AT:            '@';
DOT:           '.';
I           :   'i';

ID          :   [a-zA-Z][A-Za-z_0-9]*;

INT         :   ('-')? DIGIT+;
            
fragment DIGIT  : '0' .. '9';

WS      :       [ \t\r\n]+ -> skip;
