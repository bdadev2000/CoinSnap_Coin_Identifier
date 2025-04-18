package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.text.selection.Selection;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MultiSelectionLayout implements SelectionLayout {

    /* renamed from: a, reason: collision with root package name */
    public final LongIntMap f7069a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7070b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7071c;
    public final int d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Selection f7072f;

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MultiSelectionLayout(MutableLongIntMap mutableLongIntMap, ArrayList arrayList, int i2, int i3, boolean z2, Selection selection) {
        this.f7069a = mutableLongIntMap;
        this.f7070b = arrayList;
        this.f7071c = i2;
        this.d = i3;
        this.e = z2;
        this.f7072f = selection;
        if (arrayList.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + '.').toString());
    }

    public static void m(MutableLongObjectMap mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i2, int i3) {
        Selection selection2;
        if (selection.f7085c) {
            selection2 = new Selection(selectableInfo.a(i3), selectableInfo.a(i2), i3 > i2);
        } else {
            selection2 = new Selection(selectableInfo.a(i2), selectableInfo.a(i3), i2 > i3);
        }
        if (i2 > i3) {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + selection2).toString());
        }
        long j2 = selectableInfo.f7079a;
        int d = mutableLongObjectMap.d(j2);
        Object[] objArr = mutableLongObjectMap.f1460c;
        Object obj = objArr[d];
        mutableLongObjectMap.f1459b[d] = j2;
        objArr[d] = selection2;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean a() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo b() {
        return this.e ? k() : i();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo c() {
        return e() == CrossStatus.f7053a ? i() : k();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int d() {
        return this.d;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus e() {
        int i2 = this.f7071c;
        int i3 = this.d;
        if (i2 < i3) {
            return CrossStatus.f7054b;
        }
        if (i2 > i3) {
            return CrossStatus.f7053a;
        }
        return ((SelectableInfo) this.f7070b.get(i2 / 2)).b();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final Selection f() {
        return this.f7072f;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final MutableLongObjectMap g(Selection selection) {
        Selection.AnchorInfo anchorInfo = selection.f7083a;
        long j2 = anchorInfo.f7088c;
        Selection.AnchorInfo anchorInfo2 = selection.f7084b;
        long j3 = anchorInfo2.f7088c;
        boolean z2 = selection.f7085c;
        if (j2 != j3) {
            MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f1461a;
            MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
            Selection.AnchorInfo anchorInfo3 = selection.f7083a;
            m(mutableLongObjectMap2, selection, c(), (z2 ? anchorInfo2 : anchorInfo3).f7087b, c().f7082f.f17046a.f17038a.f16880a.length());
            j(new MultiSelectionLayout$createSubSelections$2$1(this, mutableLongObjectMap2, selection));
            if (z2) {
                anchorInfo2 = anchorInfo3;
            }
            m(mutableLongObjectMap2, selection, e() == CrossStatus.f7053a ? k() : i(), 0, anchorInfo2.f7087b);
            return mutableLongObjectMap2;
        }
        int i2 = anchorInfo.f7087b;
        int i3 = anchorInfo2.f7087b;
        if ((!z2 || i2 < i3) && (z2 || i2 > i3)) {
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + selection).toString());
        }
        MutableLongObjectMap mutableLongObjectMap3 = LongObjectMapKt.f1461a;
        MutableLongObjectMap mutableLongObjectMap4 = new MutableLongObjectMap();
        mutableLongObjectMap4.g(j2, selection);
        return mutableLongObjectMap4;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return this.f7070b.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean h(SelectionLayout selectionLayout) {
        int i2;
        if (this.f7072f != null && selectionLayout != null && (selectionLayout instanceof MultiSelectionLayout)) {
            MultiSelectionLayout multiSelectionLayout = (MultiSelectionLayout) selectionLayout;
            if (this.e == multiSelectionLayout.e && this.f7071c == multiSelectionLayout.f7071c && this.d == multiSelectionLayout.d) {
                List list = this.f7070b;
                int size = list.size();
                List list2 = multiSelectionLayout.f7070b;
                if (size == list2.size()) {
                    int size2 = list.size();
                    for (0; i2 < size2; i2 + 1) {
                        SelectableInfo selectableInfo = (SelectableInfo) list.get(i2);
                        SelectableInfo selectableInfo2 = (SelectableInfo) list2.get(i2);
                        selectableInfo.getClass();
                        i2 = (selectableInfo.f7079a == selectableInfo2.f7079a && selectableInfo.f7081c == selectableInfo2.f7081c && selectableInfo.d == selectableInfo2.d) ? i2 + 1 : 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo i() {
        return (SelectableInfo) this.f7070b.get(o(this.d, false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final void j(l lVar) {
        int n2 = n(c().f7079a);
        int n3 = n((e() == CrossStatus.f7053a ? k() : i()).f7079a);
        int i2 = n2 + 1;
        if (i2 >= n3) {
            return;
        }
        while (i2 < n3) {
            lVar.invoke(this.f7070b.get(i2));
            i2++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo k() {
        return (SelectableInfo) this.f7070b.get(o(this.f7071c, true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int l() {
        return this.f7071c;
    }

    public final int n(long j2) {
        try {
            return this.f7069a.a(j2);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(d.m("Invalid selectableId: ", j2), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i2, boolean z2) {
        int ordinal = e().ordinal();
        int i3 = z2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                i3 = 1;
            }
            return (i2 - (i3 ^ 1)) / 2;
        }
        if (z2 != 0) {
            i3 = 0;
            return (i2 - (i3 ^ 1)) / 2;
        }
        i3 = 1;
        return (i2 - (i3 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z2 = true;
        float f2 = 2;
        sb.append((this.f7071c + 1) / f2);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / f2);
        sb.append(", crossed=");
        sb.append(e());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.f7070b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            SelectableInfo selectableInfo = (SelectableInfo) list.get(i2);
            if (z2) {
                z2 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i2++;
            sb3.append(i2);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String sb4 = sb2.toString();
        p0.a.r(sb4, "StringBuilder().apply(builderAction).toString()");
        sb.append(sb4);
        sb.append(')');
        return sb.toString();
    }
}
