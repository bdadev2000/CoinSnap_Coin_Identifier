package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import q0.l;
import q0.p;

@StabilityInferred
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {

    /* renamed from: a, reason: collision with root package name */
    public final OverflowType f3935a = OverflowType.f3939b;

    /* renamed from: b, reason: collision with root package name */
    public final int f3936b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3937c;
    public final l d;
    public final l e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class OverflowType {

        /* renamed from: a, reason: collision with root package name */
        public static final OverflowType f3938a;

        /* renamed from: b, reason: collision with root package name */
        public static final OverflowType f3939b;

        /* renamed from: c, reason: collision with root package name */
        public static final OverflowType f3940c;
        public static final OverflowType d;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ OverflowType[] f3941f;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType] */
        static {
            ?? r02 = new Enum("Visible", 0);
            f3938a = r02;
            ?? r1 = new Enum("Clip", 1);
            f3939b = r1;
            ?? r2 = new Enum("ExpandIndicator", 2);
            f3940c = r2;
            ?? r3 = new Enum("ExpandOrCollapseIndicator", 3);
            d = r3;
            f3941f = new OverflowType[]{r02, r1, r2, r3};
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) f3941f.clone();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlowLayoutOverflow(int i2, int i3, l lVar, l lVar2) {
        this.f3936b = i2;
        this.f3937c = i3;
        this.d = lVar;
        this.e = lVar2;
    }

    public final void a(FlowLayoutOverflowState flowLayoutOverflowState, ArrayList arrayList) {
        l lVar = this.d;
        p pVar = lVar != null ? (p) lVar.invoke(flowLayoutOverflowState) : null;
        l lVar2 = this.e;
        p pVar2 = lVar2 != null ? (p) lVar2.invoke(flowLayoutOverflowState) : null;
        int ordinal = this.f3935a.ordinal();
        if (ordinal == 2) {
            if (pVar != null) {
                arrayList.add(pVar);
            }
        } else {
            if (ordinal != 3) {
                return;
            }
            if (pVar != null) {
                arrayList.add(pVar);
            }
            if (pVar2 != null) {
                arrayList.add(pVar2);
            }
        }
    }
}
