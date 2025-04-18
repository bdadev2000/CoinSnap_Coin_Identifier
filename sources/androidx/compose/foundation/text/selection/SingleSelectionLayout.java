package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.text.selection.Selection;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SingleSelectionLayout implements SelectionLayout {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7295a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7297c;
    public final Selection d;
    public final SelectableInfo e;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public SingleSelectionLayout(boolean z2, int i2, int i3, Selection selection, SelectableInfo selectableInfo) {
        this.f7295a = z2;
        this.f7296b = i2;
        this.f7297c = i3;
        this.d = selection;
        this.e = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean a() {
        return this.f7295a;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo b() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo c() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int d() {
        return this.f7297c;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus e() {
        int i2 = this.f7296b;
        int i3 = this.f7297c;
        return i2 < i3 ? CrossStatus.f7054b : i2 > i3 ? CrossStatus.f7053a : this.e.b();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final Selection f() {
        return this.d;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final MutableLongObjectMap g(Selection selection) {
        boolean z2 = selection.f7085c;
        Selection.AnchorInfo anchorInfo = selection.f7084b;
        Selection.AnchorInfo anchorInfo2 = selection.f7083a;
        if ((!z2 && anchorInfo2.f7087b > anchorInfo.f7087b) || (z2 && anchorInfo2.f7087b <= anchorInfo.f7087b)) {
            selection = Selection.a(selection, null, null, !z2, 3);
        }
        long j2 = this.e.f7079a;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f1461a;
        MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
        mutableLongObjectMap2.g(j2, selection);
        return mutableLongObjectMap2;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean h(SelectionLayout selectionLayout) {
        if (this.d != null && selectionLayout != null && (selectionLayout instanceof SingleSelectionLayout)) {
            SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) selectionLayout;
            if (this.f7296b == singleSelectionLayout.f7296b && this.f7297c == singleSelectionLayout.f7297c && this.f7295a == singleSelectionLayout.f7295a) {
                SelectableInfo selectableInfo = this.e;
                selectableInfo.getClass();
                SelectableInfo selectableInfo2 = singleSelectionLayout.e;
                if (selectableInfo.f7079a == selectableInfo2.f7079a && selectableInfo.f7081c == selectableInfo2.f7081c && selectableInfo.d == selectableInfo2.d) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo i() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final void j(l lVar) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo k() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int l() {
        return this.f7296b;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f7295a + ", crossed=" + e() + ", info=\n\t" + this.e + ')';
    }
}
