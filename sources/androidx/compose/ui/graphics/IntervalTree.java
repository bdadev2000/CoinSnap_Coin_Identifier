package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public final class IntervalTree<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Node f14990a = new Node(TreeColor.f14993a);

    /* loaded from: classes2.dex */
    public final class Node extends Interval<T> {
        public final Node d;
        public final Node e;

        /* renamed from: f, reason: collision with root package name */
        public final Node f14991f;

        public Node(TreeColor treeColor) {
            Node node = IntervalTree.this.f14990a;
            this.d = node;
            this.e = node;
            this.f14991f = node;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class TreeColor {

        /* renamed from: a, reason: collision with root package name */
        public static final TreeColor f14993a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TreeColor[] f14994b;

        /* JADX INFO: Fake field, exist only in values array */
        TreeColor EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.graphics.IntervalTree$TreeColor] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.graphics.IntervalTree$TreeColor] */
        static {
            ?? r02 = new Enum("Red", 0);
            ?? r1 = new Enum("Black", 1);
            f14993a = r1;
            f14994b = new TreeColor[]{r02, r1};
        }

        public static TreeColor valueOf(String str) {
            return (TreeColor) Enum.valueOf(TreeColor.class, str);
        }

        public static TreeColor[] values() {
            return (TreeColor[]) f14994b.clone();
        }
    }

    public IntervalTree() {
        new ArrayList();
    }
}
