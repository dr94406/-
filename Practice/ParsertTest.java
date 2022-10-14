package Practice;

interface Parseable {
    public abstract void parse(String fileName);
}
class ParserManager {
    Parseable parser = ParserManager.getParser("XML");
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLparser();
            return p;
        }
    }
}
class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLparser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML parsing completed.");
    }
}
public class ParsertTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser(("HTML"));
        parser.parse("document2.html");
    }
}
