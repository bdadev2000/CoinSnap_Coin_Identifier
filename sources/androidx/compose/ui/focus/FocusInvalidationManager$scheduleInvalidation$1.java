package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import d0.b0;
import kotlin.jvm.internal.o;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class FocusInvalidationManager$scheduleInvalidation$1 extends o implements a {
    @Override // q0.a
    public final Object invoke() {
        FocusInvalidationManager focusInvalidationManager;
        MutableScatterSet mutableScatterSet;
        Object[] objArr;
        long[] jArr;
        FocusInvalidationManager focusInvalidationManager2;
        MutableScatterSet mutableScatterSet2;
        Object[] objArr2;
        long[] jArr2;
        MutableVector mutableVector;
        int i2;
        FocusInvalidationManager focusInvalidationManager3;
        MutableScatterSet mutableScatterSet3;
        long[] jArr3;
        FocusInvalidationManager focusInvalidationManager4;
        int i3;
        MutableVector mutableVector2;
        Object[] objArr3;
        long[] jArr4;
        Object[] objArr4;
        long[] jArr5;
        int i4;
        MutableVector mutableVector3;
        MutableVector mutableVector4;
        Object[] objArr5;
        long[] jArr6;
        Object[] objArr6;
        long[] jArr7;
        MutableVector mutableVector5;
        FocusInvalidationManager focusInvalidationManager5 = (FocusInvalidationManager) this.receiver;
        MutableScatterSet mutableScatterSet4 = focusInvalidationManager5.e;
        Object[] objArr7 = mutableScatterSet4.f1592b;
        long[] jArr8 = mutableScatterSet4.f1591a;
        int length = jArr8.length - 2;
        char c2 = 7;
        long j2 = -9187201950435737472L;
        MutableScatterSet mutableScatterSet5 = focusInvalidationManager5.f14838c;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr8[i6];
                if ((((~j3) << c2) & j3 & j2) != j2) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) objArr7[(i6 << 3) + i8];
                            if (focusPropertiesModifierNode.z0().f14699n) {
                                Modifier.Node z02 = focusPropertiesModifierNode.z0();
                                MutableVector mutableVector6 = null;
                                while (z02 != null) {
                                    if (z02 instanceof FocusTargetNode) {
                                        mutableScatterSet5.d((FocusTargetNode) z02);
                                    } else if ((z02.f14690c & 1024) != 0 && (z02 instanceof DelegatingNode)) {
                                        Modifier.Node node = ((DelegatingNode) z02).f15909p;
                                        int i9 = 0;
                                        while (node != null) {
                                            if ((node.f14690c & 1024) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    objArr6 = objArr7;
                                                    jArr7 = jArr8;
                                                    z02 = node;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        objArr6 = objArr7;
                                                        jArr7 = jArr8;
                                                        mutableVector5 = new MutableVector(new Modifier.Node[16]);
                                                    } else {
                                                        objArr6 = objArr7;
                                                        jArr7 = jArr8;
                                                        mutableVector5 = mutableVector6;
                                                    }
                                                    if (z02 != null) {
                                                        mutableVector5.b(z02);
                                                        z02 = null;
                                                    }
                                                    mutableVector5.b(node);
                                                    mutableVector6 = mutableVector5;
                                                }
                                            } else {
                                                objArr6 = objArr7;
                                                jArr7 = jArr8;
                                            }
                                            node = node.f14692g;
                                            objArr7 = objArr6;
                                            jArr8 = jArr7;
                                        }
                                        objArr5 = objArr7;
                                        jArr6 = jArr8;
                                        if (i9 == 1) {
                                            objArr7 = objArr5;
                                            jArr8 = jArr6;
                                        }
                                        z02 = DelegatableNodeKt.b(mutableVector6);
                                        objArr7 = objArr5;
                                        jArr8 = jArr6;
                                    }
                                    objArr5 = objArr7;
                                    jArr6 = jArr8;
                                    z02 = DelegatableNodeKt.b(mutableVector6);
                                    objArr7 = objArr5;
                                    jArr8 = jArr6;
                                }
                                objArr4 = objArr7;
                                jArr5 = jArr8;
                                if (!focusPropertiesModifierNode.z0().f14699n) {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                                MutableVector mutableVector7 = new MutableVector(new Modifier.Node[16]);
                                Modifier.Node node2 = focusPropertiesModifierNode.z0().f14692g;
                                if (node2 == null) {
                                    DelegatableNodeKt.a(mutableVector7, focusPropertiesModifierNode.z0());
                                } else {
                                    mutableVector7.b(node2);
                                }
                                while (mutableVector7.m()) {
                                    Modifier.Node node3 = (Modifier.Node) mutableVector7.o(mutableVector7.f14144c - 1);
                                    if ((node3.d & 1024) == 0) {
                                        DelegatableNodeKt.a(mutableVector7, node3);
                                    } else {
                                        while (true) {
                                            if (node3 == null) {
                                                break;
                                            }
                                            if ((node3.f14690c & 1024) != 0) {
                                                MutableVector mutableVector8 = null;
                                                while (node3 != null) {
                                                    if (node3 instanceof FocusTargetNode) {
                                                        mutableScatterSet5.d((FocusTargetNode) node3);
                                                    } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                                        Modifier.Node node4 = ((DelegatingNode) node3).f15909p;
                                                        int i10 = 0;
                                                        while (node4 != null) {
                                                            if ((node4.f14690c & 1024) != 0) {
                                                                i10++;
                                                                if (i10 == 1) {
                                                                    mutableVector4 = mutableVector7;
                                                                    node3 = node4;
                                                                } else {
                                                                    if (mutableVector8 == null) {
                                                                        mutableVector4 = mutableVector7;
                                                                        mutableVector8 = new MutableVector(new Modifier.Node[16]);
                                                                    } else {
                                                                        mutableVector4 = mutableVector7;
                                                                    }
                                                                    if (node3 != null) {
                                                                        mutableVector8.b(node3);
                                                                        node3 = null;
                                                                    }
                                                                    mutableVector8.b(node4);
                                                                }
                                                            } else {
                                                                mutableVector4 = mutableVector7;
                                                            }
                                                            node4 = node4.f14692g;
                                                            mutableVector7 = mutableVector4;
                                                        }
                                                        mutableVector3 = mutableVector7;
                                                        if (i10 == 1) {
                                                            mutableVector7 = mutableVector3;
                                                        }
                                                        node3 = DelegatableNodeKt.b(mutableVector8);
                                                        mutableVector7 = mutableVector3;
                                                    }
                                                    mutableVector3 = mutableVector7;
                                                    node3 = DelegatableNodeKt.b(mutableVector8);
                                                    mutableVector7 = mutableVector3;
                                                }
                                            } else {
                                                node3 = node3.f14692g;
                                                mutableVector7 = mutableVector7;
                                            }
                                        }
                                    }
                                }
                            } else {
                                objArr4 = objArr7;
                                jArr5 = jArr8;
                            }
                            i4 = 8;
                        } else {
                            objArr4 = objArr7;
                            jArr5 = jArr8;
                            i4 = i5;
                        }
                        j3 >>= i4;
                        i8++;
                        i5 = i4;
                        objArr7 = objArr4;
                        jArr8 = jArr5;
                    }
                    objArr3 = objArr7;
                    jArr4 = jArr8;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    objArr3 = objArr7;
                    jArr4 = jArr8;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                objArr7 = objArr3;
                jArr8 = jArr4;
                c2 = 7;
                i5 = 8;
                j2 = -9187201950435737472L;
            }
        }
        mutableScatterSet4.f();
        MutableScatterSet mutableScatterSet6 = focusInvalidationManager5.d;
        Object[] objArr8 = mutableScatterSet6.f1592b;
        long[] jArr9 = mutableScatterSet6.f1591a;
        int length2 = jArr9.length - 2;
        MutableScatterSet mutableScatterSet7 = focusInvalidationManager5.f14839f;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j4 = jArr9[i11];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j4 & 255) < 128) {
                            FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) objArr8[(i11 << 3) + i13];
                            boolean z2 = focusEventModifierNode.z0().f14699n;
                            objArr2 = objArr8;
                            FocusStateImpl focusStateImpl = FocusStateImpl.f14888c;
                            if (z2) {
                                Modifier.Node z03 = focusEventModifierNode.z0();
                                boolean z3 = false;
                                boolean z4 = true;
                                FocusTargetNode focusTargetNode = null;
                                MutableVector mutableVector9 = null;
                                while (z03 != null) {
                                    FocusStateImpl focusStateImpl2 = focusStateImpl;
                                    if (z03 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) z03;
                                        if (focusTargetNode != null) {
                                            z3 = true;
                                        }
                                        if (mutableScatterSet5.a(focusTargetNode2)) {
                                            mutableScatterSet7.d(focusTargetNode2);
                                            z4 = false;
                                        }
                                        focusInvalidationManager3 = focusInvalidationManager5;
                                        mutableScatterSet3 = mutableScatterSet4;
                                        jArr3 = jArr9;
                                        focusTargetNode = focusTargetNode2;
                                    } else if ((z03.f14690c & 1024) == 0 || !(z03 instanceof DelegatingNode)) {
                                        focusInvalidationManager3 = focusInvalidationManager5;
                                        mutableScatterSet3 = mutableScatterSet4;
                                        jArr3 = jArr9;
                                    } else {
                                        Modifier.Node node5 = ((DelegatingNode) z03).f15909p;
                                        jArr3 = jArr9;
                                        int i14 = 0;
                                        while (node5 != null) {
                                            MutableScatterSet mutableScatterSet8 = mutableScatterSet4;
                                            if ((node5.f14690c & 1024) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    focusInvalidationManager4 = focusInvalidationManager5;
                                                    z03 = node5;
                                                } else {
                                                    if (mutableVector9 == null) {
                                                        focusInvalidationManager4 = focusInvalidationManager5;
                                                        i3 = i14;
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16]);
                                                    } else {
                                                        focusInvalidationManager4 = focusInvalidationManager5;
                                                        i3 = i14;
                                                        mutableVector2 = mutableVector9;
                                                    }
                                                    if (z03 != null) {
                                                        mutableVector2.b(z03);
                                                        z03 = null;
                                                    }
                                                    mutableVector2.b(node5);
                                                    mutableVector9 = mutableVector2;
                                                    i14 = i3;
                                                }
                                            } else {
                                                focusInvalidationManager4 = focusInvalidationManager5;
                                            }
                                            node5 = node5.f14692g;
                                            mutableScatterSet4 = mutableScatterSet8;
                                            focusInvalidationManager5 = focusInvalidationManager4;
                                        }
                                        focusInvalidationManager3 = focusInvalidationManager5;
                                        mutableScatterSet3 = mutableScatterSet4;
                                        if (i14 == 1) {
                                            focusStateImpl = focusStateImpl2;
                                            jArr9 = jArr3;
                                            mutableScatterSet4 = mutableScatterSet3;
                                            focusInvalidationManager5 = focusInvalidationManager3;
                                        }
                                    }
                                    z03 = DelegatableNodeKt.b(mutableVector9);
                                    focusStateImpl = focusStateImpl2;
                                    jArr9 = jArr3;
                                    mutableScatterSet4 = mutableScatterSet3;
                                    focusInvalidationManager5 = focusInvalidationManager3;
                                }
                                focusInvalidationManager2 = focusInvalidationManager5;
                                mutableScatterSet2 = mutableScatterSet4;
                                FocusStateImpl focusStateImpl3 = focusStateImpl;
                                jArr2 = jArr9;
                                if (!focusEventModifierNode.z0().f14699n) {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                                MutableVector mutableVector10 = new MutableVector(new Modifier.Node[16]);
                                Modifier.Node node6 = focusEventModifierNode.z0().f14692g;
                                if (node6 == null) {
                                    DelegatableNodeKt.a(mutableVector10, focusEventModifierNode.z0());
                                } else {
                                    mutableVector10.b(node6);
                                }
                                while (mutableVector10.m()) {
                                    Modifier.Node node7 = (Modifier.Node) mutableVector10.o(mutableVector10.f14144c - 1);
                                    if ((node7.d & 1024) == 0) {
                                        DelegatableNodeKt.a(mutableVector10, node7);
                                    } else {
                                        while (node7 != null) {
                                            if ((node7.f14690c & 1024) != 0) {
                                                MutableVector mutableVector11 = null;
                                                while (node7 != null) {
                                                    if (node7 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node7;
                                                        if (focusTargetNode != null) {
                                                            z3 = true;
                                                        }
                                                        if (mutableScatterSet5.a(focusTargetNode3)) {
                                                            mutableScatterSet7.d(focusTargetNode3);
                                                            z4 = false;
                                                        }
                                                        mutableVector = mutableVector10;
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((node7.f14690c & 1024) == 0 || !(node7 instanceof DelegatingNode)) {
                                                        mutableVector = mutableVector10;
                                                    } else {
                                                        Modifier.Node node8 = ((DelegatingNode) node7).f15909p;
                                                        int i15 = 0;
                                                        while (node8 != null) {
                                                            MutableVector mutableVector12 = mutableVector10;
                                                            if ((node8.f14690c & 1024) != 0) {
                                                                i15++;
                                                                if (i15 == 1) {
                                                                    node7 = node8;
                                                                } else {
                                                                    if (mutableVector11 == null) {
                                                                        i2 = i15;
                                                                        mutableVector11 = new MutableVector(new Modifier.Node[16]);
                                                                    } else {
                                                                        i2 = i15;
                                                                    }
                                                                    if (node7 != null) {
                                                                        mutableVector11.b(node7);
                                                                        node7 = null;
                                                                    }
                                                                    mutableVector11.b(node8);
                                                                    i15 = i2;
                                                                    node8 = node8.f14692g;
                                                                    mutableVector10 = mutableVector12;
                                                                }
                                                            }
                                                            node8 = node8.f14692g;
                                                            mutableVector10 = mutableVector12;
                                                        }
                                                        mutableVector = mutableVector10;
                                                        if (i15 == 1) {
                                                            mutableVector10 = mutableVector;
                                                        }
                                                        node7 = DelegatableNodeKt.b(mutableVector11);
                                                        mutableVector10 = mutableVector;
                                                    }
                                                    node7 = DelegatableNodeKt.b(mutableVector11);
                                                    mutableVector10 = mutableVector;
                                                }
                                            } else {
                                                node7 = node7.f14692g;
                                                mutableVector10 = mutableVector10;
                                            }
                                        }
                                    }
                                    mutableVector10 = mutableVector10;
                                }
                                if (z4) {
                                    focusEventModifierNode.v(z3 ? FocusEventModifierNodeKt.a(focusEventModifierNode) : focusTargetNode != null ? focusTargetNode.f2() : focusStateImpl3);
                                }
                                j4 >>= 8;
                                i13++;
                                objArr8 = objArr2;
                                jArr9 = jArr2;
                                mutableScatterSet4 = mutableScatterSet2;
                                focusInvalidationManager5 = focusInvalidationManager2;
                            } else {
                                focusEventModifierNode.v(focusStateImpl);
                                focusInvalidationManager2 = focusInvalidationManager5;
                                mutableScatterSet2 = mutableScatterSet4;
                            }
                        } else {
                            focusInvalidationManager2 = focusInvalidationManager5;
                            mutableScatterSet2 = mutableScatterSet4;
                            objArr2 = objArr8;
                        }
                        jArr2 = jArr9;
                        j4 >>= 8;
                        i13++;
                        objArr8 = objArr2;
                        jArr9 = jArr2;
                        mutableScatterSet4 = mutableScatterSet2;
                        focusInvalidationManager5 = focusInvalidationManager2;
                    }
                    focusInvalidationManager = focusInvalidationManager5;
                    mutableScatterSet = mutableScatterSet4;
                    objArr = objArr8;
                    jArr = jArr9;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    focusInvalidationManager = focusInvalidationManager5;
                    mutableScatterSet = mutableScatterSet4;
                    objArr = objArr8;
                    jArr = jArr9;
                }
                if (i11 == length2) {
                    break;
                }
                i11++;
                objArr8 = objArr;
                jArr9 = jArr;
                mutableScatterSet4 = mutableScatterSet;
                focusInvalidationManager5 = focusInvalidationManager;
            }
        } else {
            focusInvalidationManager = focusInvalidationManager5;
            mutableScatterSet = mutableScatterSet4;
        }
        mutableScatterSet6.f();
        Object[] objArr9 = mutableScatterSet5.f1592b;
        long[] jArr10 = mutableScatterSet5.f1591a;
        int length3 = jArr10.length - 2;
        if (length3 >= 0) {
            int i16 = 0;
            while (true) {
                long j5 = jArr10[i16];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length3)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j5 & 255) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr9[(i16 << 3) + i18];
                            if (focusTargetNode4.f14699n) {
                                FocusStateImpl f2 = focusTargetNode4.f2();
                                focusTargetNode4.i2();
                                if (f2 != focusTargetNode4.f2() || mutableScatterSet7.a(focusTargetNode4)) {
                                    FocusEventModifierNodeKt.b(focusTargetNode4);
                                }
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    }
                }
                if (i16 == length3) {
                    break;
                }
                i16++;
            }
        }
        mutableScatterSet5.f();
        mutableScatterSet7.f();
        focusInvalidationManager.f14837b.invoke();
        if (!mutableScatterSet.b()) {
            InlineClassHelperKt.b("Unprocessed FocusProperties nodes");
            throw null;
        }
        if (!mutableScatterSet6.b()) {
            InlineClassHelperKt.b("Unprocessed FocusEvent nodes");
            throw null;
        }
        if (mutableScatterSet5.b()) {
            return b0.f30125a;
        }
        InlineClassHelperKt.b("Unprocessed FocusTarget nodes");
        throw null;
    }
}
