package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class fs {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f24026a;

    /* renamed from: b, reason: collision with root package name */
    private Stack f24027b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f24028c;
    private long d;
    private b e;

    /* loaded from: classes.dex */
    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i2, int i3) {
            String trim = new String(Arrays.copyOfRange(cArr, i2, i3)).trim();
            if (StringUtils.isValidString(trim)) {
                fs.this.f24028c.append(trim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - fs.this.d;
            com.applovin.impl.sdk.n unused = fs.this.f24026a;
            if (com.applovin.impl.sdk.n.a()) {
                fs.this.f24026a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            fs fsVar = fs.this;
            fsVar.e = (b) fsVar.f24027b.pop();
            fs.this.e.d(fs.this.f24028c.toString().trim());
            fs.this.f24028c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i2, int i3) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.n unused = fs.this.f24026a;
            if (com.applovin.impl.sdk.n.a()) {
                fs.this.f24026a.a("XmlParser", "Begin parsing...");
            }
            fs.this.d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            try {
                b bVar = !fs.this.f24027b.isEmpty() ? (b) fs.this.f24027b.peek() : null;
                b bVar2 = new b(str2, fs.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                fs.this.f24027b.push(bVar2);
            } catch (Exception e) {
                com.applovin.impl.sdk.n unused = fs.this.f24026a;
                if (com.applovin.impl.sdk.n.a()) {
                    fs.this.f24026a.a("XmlParser", androidx.compose.foundation.text.input.a.A("Unable to process element <", str2, ">"), e);
                }
                throw new SAXException("Failed to start element", e);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends es {
        public b(String str, Map map, es esVar) {
            super(str, map, esVar);
        }

        public void a(es esVar) {
            if (esVar == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.e.add(esVar);
        }

        public void d(String str) {
            this.d = str;
        }
    }

    public fs(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f24026a = jVar.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(attributes.getQName(i2), attributes.getValue(i2));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public es a(String str) {
        if (str != null) {
            this.f24028c = new StringBuilder();
            this.f24027b = new Stack();
            this.e = null;
            Xml.parse(str, new a());
            b bVar = this.e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    public static es a(String str, com.applovin.impl.sdk.j jVar) {
        return new fs(jVar).a(str);
    }
}
