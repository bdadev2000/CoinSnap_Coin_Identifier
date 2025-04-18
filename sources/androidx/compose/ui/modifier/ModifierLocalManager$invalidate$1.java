package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ModifierLocalManager$invalidate$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModifierLocalManager f15869a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalManager$invalidate$1(ModifierLocalManager modifierLocalManager) {
        super(0);
        this.f15869a = modifierLocalManager;
    }

    @Override // q0.a
    public final Object invoke() {
        ModifierLocalManager modifierLocalManager = this.f15869a;
        int i2 = 0;
        modifierLocalManager.f15868f = false;
        HashSet hashSet = new HashSet();
        MutableVector mutableVector = modifierLocalManager.d;
        int i3 = mutableVector.f14144c;
        MutableVector mutableVector2 = modifierLocalManager.e;
        if (i3 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i4 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i4];
                ModifierLocal modifierLocal = (ModifierLocal) mutableVector2.f14142a[i4];
                Modifier.Node node = layoutNode.B.e;
                if (node.f14699n) {
                    ModifierLocalManager.b(node, modifierLocal, hashSet);
                }
                i4++;
            } while (i4 < i3);
        }
        mutableVector.g();
        mutableVector2.g();
        MutableVector mutableVector3 = modifierLocalManager.f15866b;
        int i5 = mutableVector3.f14144c;
        MutableVector mutableVector4 = modifierLocalManager.f15867c;
        if (i5 > 0) {
            Object[] objArr2 = mutableVector3.f14142a;
            do {
                BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) objArr2[i2];
                ModifierLocal modifierLocal2 = (ModifierLocal) mutableVector4.f14142a[i2];
                if (backwardsCompatNode.f14699n) {
                    ModifierLocalManager.b(backwardsCompatNode, modifierLocal2, hashSet);
                }
                i2++;
            } while (i2 < i5);
        }
        mutableVector3.g();
        mutableVector4.g();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).g2();
        }
        return b0.f30125a;
    }
}
