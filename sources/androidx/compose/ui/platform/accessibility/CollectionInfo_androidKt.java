package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import b1.f0;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class CollectionInfo_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [e0.w] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean a(ArrayList arrayList) {
        Collection collection;
        long j2;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            collection = w.f30218a;
        } else {
            collection = new ArrayList();
            Object obj = arrayList.get(0);
            int p2 = f0.p(arrayList);
            int i2 = 0;
            while (i2 < p2) {
                i2++;
                Object obj2 = arrayList.get(i2);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                collection.add(new Offset(OffsetKt.a(Math.abs(Offset.g(semanticsNode2.e().d()) - Offset.g(semanticsNode.e().d())), Math.abs(Offset.h(semanticsNode2.e().d()) - Offset.h(semanticsNode.e().d())))));
                obj = obj2;
            }
        }
        if (collection.size() == 1) {
            j2 = ((Offset) u.E0(collection)).f14913a;
        } else {
            if (collection.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object E0 = u.E0(collection);
            int p3 = f0.p(collection);
            if (1 <= p3) {
                int i3 = 1;
                while (true) {
                    E0 = new Offset(Offset.k(((Offset) E0).f14913a, ((Offset) collection.get(i3)).f14913a));
                    if (i3 == p3) {
                        break;
                    }
                    i3++;
                }
            }
            j2 = ((Offset) E0).f14913a;
        }
        return Offset.h(j2) < Offset.g(j2);
    }

    public static final void b(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        if (((CollectionItemInfo) SemanticsConfigurationKt.a(semanticsNode.i(), SemanticsProperties.f16837h)) != null) {
            accessibilityNodeInfoCompat.n(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 0, 0, 0, false, ((Boolean) semanticsNode.i().d(SemanticsProperties.B, CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1.f16703a)).booleanValue()));
        }
        SemanticsNode j2 = semanticsNode.j();
        if (j2 == null || SemanticsConfigurationKt.a(j2.i(), SemanticsProperties.f16835f) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.a(j2.i(), SemanticsProperties.f16836g);
        if (collectionInfo == null || (collectionInfo.f16777a >= 0 && collectionInfo.f16778b >= 0)) {
            if (semanticsNode.i().f16815a.containsKey(SemanticsProperties.B)) {
                ArrayList arrayList = new ArrayList();
                List h2 = SemanticsNode.h(j2, true, 4);
                int size = h2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) h2.get(i3);
                    if (semanticsNode2.i().f16815a.containsKey(SemanticsProperties.B)) {
                        arrayList.add(semanticsNode2);
                        if (semanticsNode2.f16821c.C() < semanticsNode.f16821c.C()) {
                            i2++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a2 = a(arrayList);
                    accessibilityNodeInfoCompat.n(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(a2 ? 0 : i2, 1, a2 ? i2 : 0, 1, false, ((Boolean) semanticsNode.i().d(SemanticsProperties.B, CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.f16702a)).booleanValue()));
                }
            }
        }
    }
}
