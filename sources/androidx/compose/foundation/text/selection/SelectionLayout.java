package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongObjectMap;
import q0.l;

/* loaded from: classes3.dex */
public interface SelectionLayout {
    boolean a();

    SelectableInfo b();

    SelectableInfo c();

    int d();

    CrossStatus e();

    Selection f();

    MutableLongObjectMap g(Selection selection);

    int getSize();

    boolean h(SelectionLayout selectionLayout);

    SelectableInfo i();

    void j(l lVar);

    SelectableInfo k();

    int l();
}
