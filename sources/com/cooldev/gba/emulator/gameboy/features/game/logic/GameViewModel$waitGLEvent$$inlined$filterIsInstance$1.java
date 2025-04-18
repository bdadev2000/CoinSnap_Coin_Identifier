package com.cooldev.gba.emulator.gameboy.features.game.logic;

import e1.h;
import e1.i;
import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public final class GameViewModel$waitGLEvent$$inlined$filterIsInstance$1 implements h {
    final /* synthetic */ h $this_unsafeTransform$inlined;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> implements i {
        final /* synthetic */ i $this_unsafeFlow;

        @e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1$2", f = "GameViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends c {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(g gVar) {
                super(gVar);
            }

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(i iVar) {
            this.$this_unsafeFlow = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override // e1.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r4, @org.jetbrains.annotations.NotNull h0.g r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                if (r4 == 0) goto L13
                r4 = r5
                com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1$2$1 r4 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1$2$1 r4 = new com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1$2$1
                r4.<init>(r5)
            L18:
                java.lang.Object r5 = r4.result
                i0.a r0 = i0.a.f30806a
                int r4 = r4.label
                if (r4 == 0) goto L31
                r0 = 1
                if (r4 != r0) goto L29
                kotlin.jvm.internal.q.m(r5)
                d0.b0 r4 = d0.b0.f30125a
                return r4
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.jvm.internal.q.m(r5)
                p0.a.A0()
                r4 = 0
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, h0.g):java.lang.Object");
        }

        @Nullable
        public final Object emit$$forInline(Object obj, @NotNull g gVar) {
            new AnonymousClass1(gVar);
            a.A0();
            throw null;
        }
    }

    public GameViewModel$waitGLEvent$$inlined$filterIsInstance$1(h hVar) {
        this.$this_unsafeTransform$inlined = hVar;
    }

    @Override // e1.h
    @Nullable
    public Object collect(@NotNull i iVar, @NotNull g gVar) {
        a.A0();
        throw null;
    }

    @Nullable
    public Object collect$$forInline(@NotNull i iVar, @NotNull g gVar) {
        new c(gVar) { // from class: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$waitGLEvent$$inlined$filterIsInstance$1.1
            int label;
            /* synthetic */ Object result;

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return GameViewModel$waitGLEvent$$inlined$filterIsInstance$1.this.collect(null, this);
            }
        };
        a.A0();
        throw null;
    }
}
