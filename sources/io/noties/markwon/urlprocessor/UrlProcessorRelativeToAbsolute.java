package io.noties.markwon.urlprocessor;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes5.dex */
public class UrlProcessorRelativeToAbsolute implements UrlProcessor {
    private final URL base;

    public UrlProcessorRelativeToAbsolute(String str) {
        this.base = obtain(str);
    }

    @Override // io.noties.markwon.urlprocessor.UrlProcessor
    public String process(String str) {
        if (this.base == null) {
            return str;
        }
        try {
            return new URL(this.base, str).toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return str;
        }
    }

    private static URL obtain(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
