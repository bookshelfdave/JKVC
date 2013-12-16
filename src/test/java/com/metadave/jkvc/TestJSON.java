package com.metadave.jkvc;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metadave.jkvc.eval.json.JKVCJsonEvalFactory;
import org.junit.Test;

public class TestJSON {

    @Test
    public void testSimple() throws Exception {

        String testData = "{\n" +
                "    \"firstName\": \"John\",\n" +
                "    \"lastName\": \"Smith\",\n" +
                "    \"age\": 25,\n" +
                "    \"address\": {\n" +
                "        \"streetAddress\": \"21 2nd Street\",\n" +
                "        \"city\": \"New York\",\n" +
                "        \"state\": \"NY\",\n" +
                "        \"postalCode\": 10021\n" +
                "    },\n" +
                "    \"phoneNumbers\": [\n" +
                "        {\n" +
                "            \"type\": \"home\",\n" +
                "            \"number\": \"212 555-1234\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"fax\",\n" +
                "            \"number\": \"646 555-4567\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readValue(testData, JsonNode.class);
        JKVCJsonEvalFactory f = new JKVCJsonEvalFactory();
        System.out.println(JKVC.prepare("firstName",f).eval(rootNode));
        System.out.println(JKVC.prepare("lastName", f).eval(rootNode));
        System.out.println(JKVC.prepare("address.postalCode",f).eval(rootNode));
        System.out.println(JKVC.prepare("phoneNumbers.@count", f).eval(rootNode));
        System.out.println(JKVC.prepare("phoneNumbers.@i[1].number", f).eval(rootNode));

    }
}
