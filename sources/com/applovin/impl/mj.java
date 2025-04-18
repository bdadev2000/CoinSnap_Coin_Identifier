package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.impl.jk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class mj {
    private static final Splitter d = Splitter.on(':');
    private static final Splitter e = Splitter.on('*');

    /* renamed from: a, reason: collision with root package name */
    private final List f25583a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f25584b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f25585c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f25586a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25587b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25588c;

        public a(int i2, long j2, int i3) {
            this.f25586a = i2;
            this.f25587b = j2;
            this.f25588c = i3;
        }
    }

    private void a(l8 l8Var, th thVar) {
        bh bhVar = new bh(8);
        l8Var.d(bhVar.c(), 0, 8);
        this.f25585c = bhVar.m() + 8;
        if (bhVar.j() != 1397048916) {
            thVar.f27165a = 0L;
        } else {
            thVar.f27165a = l8Var.f() - (this.f25585c - 12);
            this.f25584b = 2;
        }
    }

    private void b(l8 l8Var, th thVar) {
        long a2 = l8Var.a();
        int i2 = this.f25585c - 20;
        bh bhVar = new bh(i2);
        l8Var.d(bhVar.c(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            bhVar.g(2);
            short o2 = bhVar.o();
            if (o2 == 2192 || o2 == 2816 || o2 == 2817 || o2 == 2819 || o2 == 2820) {
                this.f25583a.add(new a(o2, (a2 - this.f25585c) - bhVar.m(), bhVar.m()));
            } else {
                bhVar.g(8);
            }
        }
        if (this.f25583a.isEmpty()) {
            thVar.f27165a = 0L;
        } else {
            this.f25584b = 3;
            thVar.f27165a = ((a) this.f25583a.get(0)).f25587b;
        }
    }

    private static int a(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c2 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
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
                throw dh.a("Invalid SEF name", null);
        }
    }

    public int a(l8 l8Var, th thVar, List list) {
        int i2 = this.f25584b;
        long j2 = 0;
        if (i2 == 0) {
            long a2 = l8Var.a();
            if (a2 != -1 && a2 >= 8) {
                j2 = a2 - 8;
            }
            thVar.f27165a = j2;
            this.f25584b = 1;
        } else if (i2 == 1) {
            a(l8Var, thVar);
        } else if (i2 == 2) {
            b(l8Var, thVar);
        } else if (i2 == 3) {
            a(l8Var, list);
            thVar.f27165a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void a(l8 l8Var, List list) {
        long f2 = l8Var.f();
        int a2 = (int) ((l8Var.a() - l8Var.f()) - this.f25585c);
        bh bhVar = new bh(a2);
        l8Var.d(bhVar.c(), 0, a2);
        for (int i2 = 0; i2 < this.f25583a.size(); i2++) {
            a aVar = (a) this.f25583a.get(i2);
            bhVar.f((int) (aVar.f25587b - f2));
            bhVar.g(4);
            int m2 = bhVar.m();
            int a3 = a(bhVar.c(m2));
            int i3 = aVar.f25588c - (m2 + 8);
            if (a3 == 2192) {
                list.add(a(bhVar, i3));
            } else if (a3 != 2816 && a3 != 2817 && a3 != 2819 && a3 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static jk a(bh bhVar, int i2) {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = e.splitToList(bhVar.c(i2));
        for (int i3 = 0; i3 < splitToList.size(); i3++) {
            List<String> splitToList2 = d.splitToList(splitToList.get(i3));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new jk.b(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                } catch (NumberFormatException e2) {
                    throw dh.a(null, e2);
                }
            } else {
                throw dh.a(null, null);
            }
        }
        return new jk(arrayList);
    }

    public void a() {
        this.f25583a.clear();
        this.f25584b = 0;
    }
}
