package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes4.dex */
public interface Selectable {
    AnnotatedString a();

    float b(int i2);

    float c(int i2);

    Rect d(int i2);

    LayoutCoordinates e();

    long f(Selection selection, boolean z2);

    int g();

    float h(int i2);

    long i();

    Selection j();

    void k(SelectionLayoutBuilder selectionLayoutBuilder);

    long l(int i2);
}
