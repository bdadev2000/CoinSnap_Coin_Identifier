package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.impl.gk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ij {

    /* renamed from: d, reason: collision with root package name */
    private static final Splitter f8310d = Splitter.on(':');

    /* renamed from: e, reason: collision with root package name */
    private static final Splitter f8311e = Splitter.on('*');

    /* renamed from: a, reason: collision with root package name */
    private final List f8312a = new ArrayList();
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f8313c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8314a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8315c;

        public a(int i9, long j7, int i10) {
            this.f8314a = i9;
            this.b = j7;
            this.f8315c = i10;
        }
    }

    private void a(j8 j8Var, qh qhVar) {
        yg ygVar = new yg(8);
        j8Var.d(ygVar.c(), 0, 8);
        this.f8313c = ygVar.m() + 8;
        if (ygVar.j() != 1397048916) {
            qhVar.f10346a = 0L;
        } else {
            qhVar.f10346a = j8Var.f() - (this.f8313c - 12);
            this.b = 2;
        }
    }

    private void b(j8 j8Var, qh qhVar) {
        long a6 = j8Var.a();
        int i9 = this.f8313c - 20;
        yg ygVar = new yg(i9);
        j8Var.d(ygVar.c(), 0, i9);
        for (int i10 = 0; i10 < i9 / 12; i10++) {
            ygVar.g(2);
            short o3 = ygVar.o();
            if (o3 != 2192 && o3 != 2816 && o3 != 2817 && o3 != 2819 && o3 != 2820) {
                ygVar.g(8);
            } else {
                this.f8312a.add(new a(o3, (a6 - this.f8313c) - ygVar.m(), ygVar.m()));
            }
        }
        if (this.f8312a.isEmpty()) {
            qhVar.f10346a = 0L;
        } else {
            this.b = 3;
            qhVar.f10346a = ((a) this.f8312a.get(0)).b;
        }
    }

    private static int a(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c9 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
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
        int i9 = this.b;
        long j7 = 0;
        if (i9 == 0) {
            long a6 = j8Var.a();
            if (a6 != -1 && a6 >= 8) {
                j7 = a6 - 8;
            }
            qhVar.f10346a = j7;
            this.b = 1;
        } else if (i9 == 1) {
            a(j8Var, qhVar);
        } else if (i9 == 2) {
            b(j8Var, qhVar);
        } else if (i9 == 3) {
            a(j8Var, list);
            qhVar.f10346a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void a(j8 j8Var, List list) {
        long f9 = j8Var.f();
        int a6 = (int) ((j8Var.a() - j8Var.f()) - this.f8313c);
        yg ygVar = new yg(a6);
        j8Var.d(ygVar.c(), 0, a6);
        for (int i9 = 0; i9 < this.f8312a.size(); i9++) {
            a aVar = (a) this.f8312a.get(i9);
            ygVar.f((int) (aVar.b - f9));
            ygVar.g(4);
            int m = ygVar.m();
            int a9 = a(ygVar.c(m));
            int i10 = aVar.f8315c - (m + 8);
            if (a9 == 2192) {
                list.add(a(ygVar, i10));
            } else if (a9 != 2816 && a9 != 2817 && a9 != 2819 && a9 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static gk a(yg ygVar, int i9) {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = f8311e.splitToList(ygVar.c(i9));
        for (int i10 = 0; i10 < splitToList.size(); i10++) {
            List<String> splitToList2 = f8310d.splitToList(splitToList.get(i10));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new gk.b(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                } catch (NumberFormatException e4) {
                    throw ah.a(null, e4);
                }
            } else {
                throw ah.a(null, null);
            }
        }
        return new gk(arrayList);
    }

    public void a() {
        this.f8312a.clear();
        this.b = 0;
    }
}
