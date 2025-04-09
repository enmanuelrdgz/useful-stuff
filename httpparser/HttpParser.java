package httpparser;

import java.io.InputStream;

public class HttpParser {
    public HttpRequest parse(InputStream stream) {
        stream.read();
        
        return new HttpRequest();
    }
}
