package androidx.compose.ui.text;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;
import p0.a;

/* loaded from: classes.dex */
public final class Html_androidKt$TagHandler$1 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z2, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z2 || !a.g(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
    }
}
