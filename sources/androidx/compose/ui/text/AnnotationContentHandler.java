package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import p0.a;

/* loaded from: classes3.dex */
final class AnnotationContentHandler implements ContentHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ContentHandler f16894a;

    /* renamed from: b, reason: collision with root package name */
    public final Editable f16895b;

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.f16894a = contentHandler;
        this.f16895b = editable;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i2, int i3) {
        this.f16894a.characters(cArr, i2, i3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() {
        this.f16894a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (!a.g(str2, "annotation")) {
            this.f16894a.endElement(str, str2, str3);
            return;
        }
        Editable editable = this.f16895b;
        Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (editable.getSpanFlags((AnnotationSpan) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i2);
            int spanStart = editable.getSpanStart(annotationSpan);
            int length = editable.length();
            editable.removeSpan(annotationSpan);
            if (spanStart != length) {
                editable.setSpan(annotationSpan, spanStart, length, 33);
            }
        }
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) {
        this.f16894a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i2, int i3) {
        this.f16894a.ignorableWhitespace(cArr, i2, i3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        this.f16894a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f16894a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) {
        this.f16894a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() {
        this.f16894a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (!a.g(str2, "annotation")) {
            this.f16894a.startElement(str, str2, str3, attributes);
            return;
        }
        if (attributes != null) {
            int length = attributes.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                String localName = attributes.getLocalName(i2);
                if (localName == null) {
                    localName = "";
                }
                String value = attributes.getValue(i2);
                String str4 = value != null ? value : "";
                if (localName.length() > 0 && str4.length() > 0) {
                    Editable editable = this.f16895b;
                    int length2 = editable.length();
                    editable.setSpan(new Object(), length2, length2, 17);
                }
            }
        }
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) {
        this.f16894a.startPrefixMapping(str, str2);
    }
}
