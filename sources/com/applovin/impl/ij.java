package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.impl.gk;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ij {

    /* renamed from: d, reason: collision with root package name */
    private static final Splitter f5346d = Splitter.on(AbstractJsonLexerKt.COLON);

    /* renamed from: e, reason: collision with root package name */
    private static final Splitter f5347e = Splitter.on('*');
    private final List a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f5348b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f5349c;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5350b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5351c;

        public a(int i10, long j3, int i11) {
            this.a = i10;
            this.f5350b = j3;
            this.f5351c = i11;
        }
    }

    private void a(j8 j8Var, qh qhVar) {
        yg ygVar = new yg(8);
        j8Var.d(ygVar.c(), 0, 8);
        this.f5349c = ygVar.m() + 8;
        if (ygVar.j() != 1397048916) {
            qhVar.a = 0L;
        } else {
            qhVar.a = j8Var.f() - (this.f5349c - 12);
            this.f5348b = 2;
        }
    }

    private void b(j8 j8Var, qh qhVar) {
        long a10 = j8Var.a();
        int i10 = this.f5349c - 20;
        yg ygVar = new yg(i10);
        j8Var.d(ygVar.c(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            ygVar.g(2);
            short o10 = ygVar.o();
            if (o10 != 2192 && o10 != 2816 && o10 != 2817 && o10 != 2819 && o10 != 2820) {
                ygVar.g(8);
            } else {
                this.a.add(new a(o10, (a10 - this.f5349c) - ygVar.m(), ygVar.m()));
            }
        }
        if (this.a.isEmpty()) {
            qhVar.a = 0L;
        } else {
            this.f5348b = 3;
            qhVar.a = ((a) this.a.get(0)).f5350b;
        }
    }

    private static int a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw ah.a("Invalid SEF name", null);
        }
    }

    public int a(j8 j8Var, qh qhVar, List list) {
        int i10 = this.f5348b;
        long j3 = 0;
        if (i10 == 0) {
            long a10 = j8Var.a();
            if (a10 != -1 && a10 >= 8) {
                j3 = a10 - 8;
            }
            qhVar.a = j3;
            this.f5348b = 1;
        } else if (i10 == 1) {
            a(j8Var, qhVar);
        } else if (i10 == 2) {
            b(j8Var, qhVar);
        } else if (i10 == 3) {
            a(j8Var, list);
            qhVar.a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void a(j8 j8Var, List list) {
        long f10 = j8Var.f();
        int a10 = (int) ((j8Var.a() - j8Var.f()) - this.f5349c);
        yg ygVar = new yg(a10);
        j8Var.d(ygVar.c(), 0, a10);
        for (int i10 = 0; i10 < this.a.size(); i10++) {
            a aVar = (a) this.a.get(i10);
            ygVar.f((int) (aVar.f5350b - f10));
            ygVar.g(4);
            int m10 = ygVar.m();
            int a11 = a(ygVar.c(m10));
            int i11 = aVar.f5351c - (m10 + 8);
            if (a11 == 2192) {
                list.add(a(ygVar, i11));
            } else if (a11 != 2816 && a11 != 2817 && a11 != 2819 && a11 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static gk a(yg ygVar, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = f5347e.splitToList(ygVar.c(i10));
        for (int i11 = 0; i11 < splitToList.size(); i11++) {
            List<String> splitToList2 = f5346d.splitToList(splitToList.get(i11));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new gk.b(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                } catch (NumberFormatException e2) {
                    throw ah.a(null, e2);
                }
            } else {
                throw ah.a(null, null);
            }
        }
        return new gk(arrayList);
    }

    public void a() {
        this.a.clear();
        this.f5348b = 0;
    }
}
