package androidx.compose.ui.node;

/* loaded from: classes3.dex */
public interface TraversableNode extends DelegatableNode {

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes3.dex */
        public static final class TraverseDescendantsAction {

            /* renamed from: a, reason: collision with root package name */
            public static final TraverseDescendantsAction f16172a;

            /* renamed from: b, reason: collision with root package name */
            public static final TraverseDescendantsAction f16173b;

            /* renamed from: c, reason: collision with root package name */
            public static final TraverseDescendantsAction f16174c;
            public static final /* synthetic */ TraverseDescendantsAction[] d;

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction] */
            static {
                ?? r02 = new Enum("ContinueTraversal", 0);
                f16172a = r02;
                ?? r1 = new Enum("SkipSubtreeAndContinueTraversal", 1);
                f16173b = r1;
                ?? r2 = new Enum("CancelTraversal", 2);
                f16174c = r2;
                d = new TraverseDescendantsAction[]{r02, r1, r2};
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) d.clone();
            }
        }
    }

    Object Q();
}
