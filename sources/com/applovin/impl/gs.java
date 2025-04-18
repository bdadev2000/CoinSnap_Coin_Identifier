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
public class gs {
    private final com.applovin.impl.sdk.t a;

    /* renamed from: b, reason: collision with root package name */
    private Stack f5034b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f5035c;

    /* renamed from: d, reason: collision with root package name */
    private long f5036d;

    /* renamed from: e, reason: collision with root package name */
    private b f5037e;

    /* loaded from: classes.dex */
    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            String trim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
            if (StringUtils.isValidString(trim)) {
                gs.this.f5035c.append(trim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - gs.this.f5036d;
            com.applovin.impl.sdk.t unused = gs.this.a;
            if (com.applovin.impl.sdk.t.a()) {
                gs.this.a.a("XmlParser", a4.j.f("Finished parsing in ", seconds, " seconds"));
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            gs gsVar = gs.this;
            gsVar.f5037e = (b) gsVar.f5034b.pop();
            gs.this.f5037e.d(gs.this.f5035c.toString().trim());
            gs.this.f5035c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i10, int i11) {
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
            com.applovin.impl.sdk.t unused = gs.this.a;
            if (com.applovin.impl.sdk.t.a()) {
                gs.this.a.a("XmlParser", "Begin parsing...");
            }
            gs.this.f5036d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            b bVar;
            try {
                if (!gs.this.f5034b.isEmpty()) {
                    bVar = (b) gs.this.f5034b.peek();
                } else {
                    bVar = null;
                }
                b bVar2 = new b(str2, gs.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                gs.this.f5034b.push(bVar2);
            } catch (Exception e2) {
                com.applovin.impl.sdk.t unused = gs.this.a;
                if (com.applovin.impl.sdk.t.a()) {
                    gs.this.a.a("XmlParser", com.applovin.impl.mediation.ads.e.f("Unable to process element <", str2, ">"), e2);
                }
                throw new SAXException("Failed to start element", e2);
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
                this.f4805e.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        public void d(String str) {
            this.f4804d = str;
        }
    }

    public gs(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.a = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(attributes.getQName(i10), attributes.getValue(i10));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public fs a(String str) {
        if (str != null) {
            this.f5035c = new StringBuilder();
            this.f5034b = new Stack();
            this.f5037e = null;
            Xml.parse(str, new a());
            b bVar = this.f5037e;
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
