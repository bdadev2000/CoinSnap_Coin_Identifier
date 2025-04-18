package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;

/* loaded from: classes.dex */
public interface SelectionAdjustment {

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7089a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f7090b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f7091c;
        public static final a d;
        public static final a e;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.selection.a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.text.selection.a] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.text.selection.a] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.text.selection.a] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.foundation.text.selection.a] */
        static {
            final int i2 = 0;
            f7089a = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo b2;
                    Selection.AnchorInfo anchorInfo;
                    Selection.AnchorInfo anchorInfo2;
                    CrossStatus crossStatus = CrossStatus.f7053a;
                    switch (i2) {
                        case 0:
                            return new Selection(selectionLayout.k().a(selectionLayout.k().f7081c), selectionLayout.i().a(selectionLayout.i().d), selectionLayout.e() == crossStatus);
                        case 1:
                            return SelectionAdjustmentKt.e(SelectionAdjustment.Companion.f7089a.a(selectionLayout), selectionLayout);
                        case 2:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f7093a);
                        case 3:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f7092a);
                        default:
                            Selection f2 = selectionLayout.f();
                            if (f2 == null) {
                                return SelectionAdjustment.Companion.f7091c.a(selectionLayout);
                            }
                            boolean a2 = selectionLayout.a();
                            Selection.AnchorInfo anchorInfo3 = f2.f7084b;
                            Selection.AnchorInfo anchorInfo4 = f2.f7083a;
                            if (a2) {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.k(), anchorInfo4);
                                anchorInfo = b2;
                                anchorInfo2 = anchorInfo3;
                                anchorInfo3 = anchorInfo4;
                            } else {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.i(), anchorInfo3);
                                anchorInfo = anchorInfo4;
                                anchorInfo2 = b2;
                            }
                            if (!p0.a.g(b2, anchorInfo3)) {
                                if (selectionLayout.e() != crossStatus && (selectionLayout.e() != CrossStatus.f7055c || anchorInfo.f7087b <= anchorInfo2.f7087b)) {
                                    r2 = false;
                                }
                                f2 = SelectionAdjustmentKt.e(new Selection(anchorInfo, anchorInfo2, r2), selectionLayout);
                            }
                            return f2;
                    }
                }
            };
            final int i3 = 1;
            f7090b = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo b2;
                    Selection.AnchorInfo anchorInfo;
                    Selection.AnchorInfo anchorInfo2;
                    CrossStatus crossStatus = CrossStatus.f7053a;
                    switch (i3) {
                        case 0:
                            return new Selection(selectionLayout.k().a(selectionLayout.k().f7081c), selectionLayout.i().a(selectionLayout.i().d), selectionLayout.e() == crossStatus);
                        case 1:
                            return SelectionAdjustmentKt.e(SelectionAdjustment.Companion.f7089a.a(selectionLayout), selectionLayout);
                        case 2:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f7093a);
                        case 3:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f7092a);
                        default:
                            Selection f2 = selectionLayout.f();
                            if (f2 == null) {
                                return SelectionAdjustment.Companion.f7091c.a(selectionLayout);
                            }
                            boolean a2 = selectionLayout.a();
                            Selection.AnchorInfo anchorInfo3 = f2.f7084b;
                            Selection.AnchorInfo anchorInfo4 = f2.f7083a;
                            if (a2) {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.k(), anchorInfo4);
                                anchorInfo = b2;
                                anchorInfo2 = anchorInfo3;
                                anchorInfo3 = anchorInfo4;
                            } else {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.i(), anchorInfo3);
                                anchorInfo = anchorInfo4;
                                anchorInfo2 = b2;
                            }
                            if (!p0.a.g(b2, anchorInfo3)) {
                                if (selectionLayout.e() != crossStatus && (selectionLayout.e() != CrossStatus.f7055c || anchorInfo.f7087b <= anchorInfo2.f7087b)) {
                                    r2 = false;
                                }
                                f2 = SelectionAdjustmentKt.e(new Selection(anchorInfo, anchorInfo2, r2), selectionLayout);
                            }
                            return f2;
                    }
                }
            };
            final int i4 = 2;
            f7091c = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo b2;
                    Selection.AnchorInfo anchorInfo;
                    Selection.AnchorInfo anchorInfo2;
                    CrossStatus crossStatus = CrossStatus.f7053a;
                    switch (i4) {
                        case 0:
                            return new Selection(selectionLayout.k().a(selectionLayout.k().f7081c), selectionLayout.i().a(selectionLayout.i().d), selectionLayout.e() == crossStatus);
                        case 1:
                            return SelectionAdjustmentKt.e(SelectionAdjustment.Companion.f7089a.a(selectionLayout), selectionLayout);
                        case 2:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f7093a);
                        case 3:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f7092a);
                        default:
                            Selection f2 = selectionLayout.f();
                            if (f2 == null) {
                                return SelectionAdjustment.Companion.f7091c.a(selectionLayout);
                            }
                            boolean a2 = selectionLayout.a();
                            Selection.AnchorInfo anchorInfo3 = f2.f7084b;
                            Selection.AnchorInfo anchorInfo4 = f2.f7083a;
                            if (a2) {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.k(), anchorInfo4);
                                anchorInfo = b2;
                                anchorInfo2 = anchorInfo3;
                                anchorInfo3 = anchorInfo4;
                            } else {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.i(), anchorInfo3);
                                anchorInfo = anchorInfo4;
                                anchorInfo2 = b2;
                            }
                            if (!p0.a.g(b2, anchorInfo3)) {
                                if (selectionLayout.e() != crossStatus && (selectionLayout.e() != CrossStatus.f7055c || anchorInfo.f7087b <= anchorInfo2.f7087b)) {
                                    r2 = false;
                                }
                                f2 = SelectionAdjustmentKt.e(new Selection(anchorInfo, anchorInfo2, r2), selectionLayout);
                            }
                            return f2;
                    }
                }
            };
            final int i5 = 3;
            d = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo b2;
                    Selection.AnchorInfo anchorInfo;
                    Selection.AnchorInfo anchorInfo2;
                    CrossStatus crossStatus = CrossStatus.f7053a;
                    switch (i5) {
                        case 0:
                            return new Selection(selectionLayout.k().a(selectionLayout.k().f7081c), selectionLayout.i().a(selectionLayout.i().d), selectionLayout.e() == crossStatus);
                        case 1:
                            return SelectionAdjustmentKt.e(SelectionAdjustment.Companion.f7089a.a(selectionLayout), selectionLayout);
                        case 2:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f7093a);
                        case 3:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f7092a);
                        default:
                            Selection f2 = selectionLayout.f();
                            if (f2 == null) {
                                return SelectionAdjustment.Companion.f7091c.a(selectionLayout);
                            }
                            boolean a2 = selectionLayout.a();
                            Selection.AnchorInfo anchorInfo3 = f2.f7084b;
                            Selection.AnchorInfo anchorInfo4 = f2.f7083a;
                            if (a2) {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.k(), anchorInfo4);
                                anchorInfo = b2;
                                anchorInfo2 = anchorInfo3;
                                anchorInfo3 = anchorInfo4;
                            } else {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.i(), anchorInfo3);
                                anchorInfo = anchorInfo4;
                                anchorInfo2 = b2;
                            }
                            if (!p0.a.g(b2, anchorInfo3)) {
                                if (selectionLayout.e() != crossStatus && (selectionLayout.e() != CrossStatus.f7055c || anchorInfo.f7087b <= anchorInfo2.f7087b)) {
                                    r2 = false;
                                }
                                f2 = SelectionAdjustmentKt.e(new Selection(anchorInfo, anchorInfo2, r2), selectionLayout);
                            }
                            return f2;
                    }
                }
            };
            final int i6 = 4;
            e = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo b2;
                    Selection.AnchorInfo anchorInfo;
                    Selection.AnchorInfo anchorInfo2;
                    CrossStatus crossStatus = CrossStatus.f7053a;
                    switch (i6) {
                        case 0:
                            return new Selection(selectionLayout.k().a(selectionLayout.k().f7081c), selectionLayout.i().a(selectionLayout.i().d), selectionLayout.e() == crossStatus);
                        case 1:
                            return SelectionAdjustmentKt.e(SelectionAdjustment.Companion.f7089a.a(selectionLayout), selectionLayout);
                        case 2:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f7093a);
                        case 3:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f7092a);
                        default:
                            Selection f2 = selectionLayout.f();
                            if (f2 == null) {
                                return SelectionAdjustment.Companion.f7091c.a(selectionLayout);
                            }
                            boolean a2 = selectionLayout.a();
                            Selection.AnchorInfo anchorInfo3 = f2.f7084b;
                            Selection.AnchorInfo anchorInfo4 = f2.f7083a;
                            if (a2) {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.k(), anchorInfo4);
                                anchorInfo = b2;
                                anchorInfo2 = anchorInfo3;
                                anchorInfo3 = anchorInfo4;
                            } else {
                                b2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.i(), anchorInfo3);
                                anchorInfo = anchorInfo4;
                                anchorInfo2 = b2;
                            }
                            if (!p0.a.g(b2, anchorInfo3)) {
                                if (selectionLayout.e() != crossStatus && (selectionLayout.e() != CrossStatus.f7055c || anchorInfo.f7087b <= anchorInfo2.f7087b)) {
                                    r2 = false;
                                }
                                f2 = SelectionAdjustmentKt.e(new Selection(anchorInfo, anchorInfo2, r2), selectionLayout);
                            }
                            return f2;
                    }
                }
            };
        }
    }

    Selection a(SelectionLayout selectionLayout);
}
