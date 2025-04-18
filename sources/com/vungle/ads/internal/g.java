package com.vungle.ads.internal;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NEW' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public abstract class g {
    private static final /* synthetic */ g[] $VALUES = $values();
    public static final g ERROR;
    public static final g FINISHED;
    public static final g LOADING;
    public static final g NEW;
    public static final g PLAYING;
    public static final g READY;

    private static final /* synthetic */ g[] $values() {
        return new g[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
    }

    static {
        final String str = "NEW";
        final int i10 = 0;
        NEW = new g(str, i10) { // from class: com.vungle.ads.internal.d
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.vungle.ads.internal.g
            public boolean canTransitionTo(g adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                if (adState != g.LOADING && adState != g.READY && adState != g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str2 = "LOADING";
        final int i11 = 1;
        LOADING = new g(str2, i11) { // from class: com.vungle.ads.internal.c
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.vungle.ads.internal.g
            public boolean canTransitionTo(g adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                if (adState != g.READY && adState != g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str3 = "READY";
        final int i12 = 2;
        READY = new g(str3, i12) { // from class: com.vungle.ads.internal.f
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.vungle.ads.internal.g
            public boolean canTransitionTo(g adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                if (adState != g.PLAYING && adState != g.FINISHED && adState != g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str4 = "PLAYING";
        final int i13 = 3;
        PLAYING = new g(str4, i13) { // from class: com.vungle.ads.internal.e
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.vungle.ads.internal.g
            public boolean canTransitionTo(g adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                if (adState != g.FINISHED && adState != g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str5 = "FINISHED";
        final int i14 = 4;
        FINISHED = new g(str5, i14) { // from class: com.vungle.ads.internal.b
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.vungle.ads.internal.g
            public boolean canTransitionTo(g adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                return false;
            }
        };
        final String str6 = "ERROR";
        final int i15 = 5;
        ERROR = new g(str6, i15) { // from class: com.vungle.ads.internal.a
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.vungle.ads.internal.g
            public boolean canTransitionTo(g adState) {
                Intrinsics.checkNotNullParameter(adState, "adState");
                if (adState == g.FINISHED) {
                    return true;
                }
                return false;
            }
        };
    }

    public /* synthetic */ g(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public abstract boolean canTransitionTo(g gVar);

    public final boolean isTerminalState() {
        return CollectionsKt.listOf((Object[]) new g[]{FINISHED, ERROR}).contains(this);
    }

    public final g transitionTo(g adState) {
        boolean z10;
        Intrinsics.checkNotNullParameter(adState, "adState");
        if (this != adState && !canTransitionTo(adState)) {
            String str = "Cannot transition from " + name() + " to " + adState.name();
            z10 = v.THROW_ON_ILLEGAL_TRANSITION;
            if (!z10) {
                com.vungle.ads.internal.util.v.Companion.e("AdInternal", "Illegal state transition", new IllegalStateException(str));
            } else {
                throw new IllegalStateException(str);
            }
        }
        return adState;
    }

    private g(String str, int i10) {
    }
}
