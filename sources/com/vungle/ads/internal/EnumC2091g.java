package com.vungle.ads.internal;

import u7.AbstractC2817h;

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
/* renamed from: com.vungle.ads.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC2091g {
    private static final /* synthetic */ EnumC2091g[] $VALUES = $values();
    public static final EnumC2091g ERROR;
    public static final EnumC2091g FINISHED;
    public static final EnumC2091g LOADING;
    public static final EnumC2091g NEW;
    public static final EnumC2091g PLAYING;
    public static final EnumC2091g READY;

    private static final /* synthetic */ EnumC2091g[] $values() {
        return new EnumC2091g[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
    }

    static {
        final String str = "NEW";
        final int i9 = 0;
        NEW = new EnumC2091g(str, i9) { // from class: com.vungle.ads.internal.d
            {
                G7.f fVar = null;
            }

            @Override // com.vungle.ads.internal.EnumC2091g
            public boolean canTransitionTo(EnumC2091g enumC2091g) {
                G7.j.e(enumC2091g, "adState");
                if (enumC2091g != EnumC2091g.LOADING && enumC2091g != EnumC2091g.READY && enumC2091g != EnumC2091g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str2 = "LOADING";
        final int i10 = 1;
        LOADING = new EnumC2091g(str2, i10) { // from class: com.vungle.ads.internal.c
            {
                G7.f fVar = null;
            }

            @Override // com.vungle.ads.internal.EnumC2091g
            public boolean canTransitionTo(EnumC2091g enumC2091g) {
                G7.j.e(enumC2091g, "adState");
                if (enumC2091g != EnumC2091g.READY && enumC2091g != EnumC2091g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str3 = "READY";
        final int i11 = 2;
        READY = new EnumC2091g(str3, i11) { // from class: com.vungle.ads.internal.f
            {
                G7.f fVar = null;
            }

            @Override // com.vungle.ads.internal.EnumC2091g
            public boolean canTransitionTo(EnumC2091g enumC2091g) {
                G7.j.e(enumC2091g, "adState");
                if (enumC2091g != EnumC2091g.PLAYING && enumC2091g != EnumC2091g.FINISHED && enumC2091g != EnumC2091g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str4 = "PLAYING";
        final int i12 = 3;
        PLAYING = new EnumC2091g(str4, i12) { // from class: com.vungle.ads.internal.e
            {
                G7.f fVar = null;
            }

            @Override // com.vungle.ads.internal.EnumC2091g
            public boolean canTransitionTo(EnumC2091g enumC2091g) {
                G7.j.e(enumC2091g, "adState");
                if (enumC2091g != EnumC2091g.FINISHED && enumC2091g != EnumC2091g.ERROR) {
                    return false;
                }
                return true;
            }
        };
        final String str5 = "FINISHED";
        final int i13 = 4;
        FINISHED = new EnumC2091g(str5, i13) { // from class: com.vungle.ads.internal.b
            {
                G7.f fVar = null;
            }

            @Override // com.vungle.ads.internal.EnumC2091g
            public boolean canTransitionTo(EnumC2091g enumC2091g) {
                G7.j.e(enumC2091g, "adState");
                return false;
            }
        };
        final String str6 = "ERROR";
        final int i14 = 5;
        ERROR = new EnumC2091g(str6, i14) { // from class: com.vungle.ads.internal.a
            {
                G7.f fVar = null;
            }

            @Override // com.vungle.ads.internal.EnumC2091g
            public boolean canTransitionTo(EnumC2091g enumC2091g) {
                G7.j.e(enumC2091g, "adState");
                if (enumC2091g == EnumC2091g.FINISHED) {
                    return true;
                }
                return false;
            }
        };
    }

    public /* synthetic */ EnumC2091g(String str, int i9, G7.f fVar) {
        this(str, i9);
    }

    public static EnumC2091g valueOf(String str) {
        return (EnumC2091g) Enum.valueOf(EnumC2091g.class, str);
    }

    public static EnumC2091g[] values() {
        return (EnumC2091g[]) $VALUES.clone();
    }

    public abstract boolean canTransitionTo(EnumC2091g enumC2091g);

    public final boolean isTerminalState() {
        return AbstractC2817h.B(FINISHED, ERROR).contains(this);
    }

    public final EnumC2091g transitionTo(EnumC2091g enumC2091g) {
        boolean z8;
        G7.j.e(enumC2091g, "adState");
        if (this != enumC2091g && !canTransitionTo(enumC2091g)) {
            String str = "Cannot transition from " + name() + " to " + enumC2091g.name();
            z8 = AbstractC2115v.THROW_ON_ILLEGAL_TRANSITION;
            if (!z8) {
                com.vungle.ads.internal.util.v.Companion.e("AdInternal", "Illegal state transition", new IllegalStateException(str));
            } else {
                throw new IllegalStateException(str);
            }
        }
        return enumC2091g;
    }

    private EnumC2091g(String str, int i9) {
    }
}
