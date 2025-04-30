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
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class gs {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f8008a;
    private Stack b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f8009c;

    /* renamed from: d, reason: collision with root package name */
    private long f8010d;

    /* renamed from: e, reason: collision with root package name */
    private b f8011e;

    /* loaded from: classes.dex */
    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i9, int i10) {
            String trim = new String(Arrays.copyOfRange(cArr, i9, i10)).trim();
            if (StringUtils.isValidString(trim)) {
                gs.this.f8009c.append(trim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - gs.this.f8010d;
            com.applovin.impl.sdk.t unused = gs.this.f8008a;
            if (com.applovin.impl.sdk.t.a()) {
                gs.this.f8008a.a("XmlParser", L.j("Finished parsing in ", seconds, " seconds"));
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            gs gsVar = gs.this;
            gsVar.f8011e = (b) gsVar.b.pop();
            gs.this.f8011e.d(gs.this.f8009c.toString().trim());
            gs.this.f8009c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i9, int i10) {
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
            com.applovin.impl.sdk.t unused = gs.this.f8008a;
            if (com.applovin.impl.sdk.t.a()) {
                gs.this.f8008a.a("XmlParser", "Begin parsing...");
            }
            gs.this.f8010d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            b bVar;
            try {
                if (!gs.this.b.isEmpty()) {
                    bVar = (b) gs.this.b.peek();
                } else {
                    bVar = null;
                }
                b bVar2 = new b(str2, gs.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                gs.this.b.push(bVar2);
            } catch (Exception e4) {
                com.applovin.impl.sdk.t unused = gs.this.f8008a;
                if (com.applovin.impl.sdk.t.a()) {
                    gs.this.f8008a.a("XmlParser", AbstractC2914a.e("Unable to process element <", str2, ">"), e4);
                }
                throw new SAXException("Failed to start element", e4);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends fs {
        public b(String str, Map map, fs fsVar) {
            super(str, map, fsVar);
        }

        public void a(fs fsVar) {
            if (fsVar != null) {
                this.f7763e.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        public void d(String str) {
            this.f7762d = str;
        }
    }

    public gs(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.f8008a = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i9 = 0; i9 < length; i9++) {
                hashMap.put(attributes.getQName(i9), attributes.getValue(i9));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public fs a(String str) {
        if (str != null) {
            this.f8009c = new StringBuilder();
            this.b = new Stack();
            this.f8011e = null;
            Xml.parse(str, new a());
            b bVar = this.f8011e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    public static fs a(String str, com.applovin.impl.sdk.k kVar) {
        return new gs(kVar).a(str);
    }
}
