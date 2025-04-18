package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24566a;

    /* loaded from: classes.dex */
    public static final class a extends j1 {

        /* renamed from: b, reason: collision with root package name */
        public final long f24567b;

        /* renamed from: c, reason: collision with root package name */
        public final List f24568c;
        public final List d;

        public a(int i2, long j2) {
            super(i2);
            this.f24567b = j2;
            this.f24568c = new ArrayList();
            this.d = new ArrayList();
        }

        public void a(a aVar) {
            this.d.add(aVar);
        }

        public a d(int i2) {
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.d.get(i3);
                if (aVar.f24566a == i2) {
                    return aVar;
                }
            }
            return null;
        }

        public b e(int i2) {
            int size = this.f24568c.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = (b) this.f24568c.get(i3);
                if (bVar.f24566a == i2) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.applovin.impl.j1
        public String toString() {
            return j1.a(this.f24566a) + " leaves: " + Arrays.toString(this.f24568c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }

        public void a(b bVar) {
            this.f24568c.add(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j1 {

        /* renamed from: b, reason: collision with root package name */
        public final bh f24569b;

        public b(int i2, bh bhVar) {
            super(i2);
            this.f24569b = bhVar;
        }
    }

    public j1(int i2) {
        this.f24566a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static int c(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.f24566a);
    }
}
