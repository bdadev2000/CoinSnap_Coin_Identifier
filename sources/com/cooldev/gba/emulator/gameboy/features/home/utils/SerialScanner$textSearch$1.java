package com.cooldev.gba.emulator.gameboy.features.home.utils;

import d0.k;
import e0.u;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;
import y0.j;
import y0.m;

/* loaded from: classes.dex */
public final class SerialScanner$textSearch$1 extends r implements l {
    final /* synthetic */ List<byte[]> $byteQueries;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner$textSearch$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ byte[] $serial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(byte[] bArr) {
            super(1);
            this.$serial = bArr;
        }

        @Override // q0.l
        @NotNull
        public final Integer invoke(@NotNull byte[] bArr) {
            a.s(bArr, "it");
            return Integer.valueOf(UtilsKt.indexOf(this.$serial, bArr));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner$textSearch$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(int i2) {
            return Boolean.valueOf(i2 >= 0);
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialScanner$textSearch$1(List<byte[]> list) {
        super(1);
        this.$byteQueries = list;
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner$textSearch$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends r implements l {
        final /* synthetic */ byte[] $serial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(byte[] bArr) {
            super(1);
            this.$serial = bArr;
        }

        @NotNull
        public final k invoke(int i2) {
            return new k(this.$serial, Integer.valueOf(i2));
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    @Override // q0.l
    @NotNull
    public final j invoke(@NotNull byte[] bArr) {
        a.s(bArr, "serial");
        return m.P(m.L(m.P(u.z0(this.$byteQueries), new AnonymousClass1(bArr)), AnonymousClass2.INSTANCE), new AnonymousClass3(bArr));
    }
}
