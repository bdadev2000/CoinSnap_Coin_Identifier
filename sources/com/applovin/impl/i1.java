package com.applovin.impl;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i1 {
    public final int a;

    /* loaded from: classes.dex */
    public static final class a extends i1 {

        /* renamed from: b, reason: collision with root package name */
        public final long f5235b;

        /* renamed from: c, reason: collision with root package name */
        public final List f5236c;

        /* renamed from: d, reason: collision with root package name */
        public final List f5237d;

        public a(int i10, long j3) {
            super(i10);
            this.f5235b = j3;
            this.f5236c = new ArrayList();
            this.f5237d = new ArrayList();
        }

        public void a(a aVar) {
            this.f5237d.add(aVar);
        }

        public a d(int i10) {
            int size = this.f5237d.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f5237d.get(i11);
                if (aVar.a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b e(int i10) {
            int size = this.f5236c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f5236c.get(i11);
                if (bVar.a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.applovin.impl.i1
        public String toString() {
            return i1.a(this.a) + " leaves: " + Arrays.toString(this.f5236c.toArray()) + " containers: " + Arrays.toString(this.f5237d.toArray());
        }

        public void a(b bVar) {
            this.f5236c.add(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i1 {

        /* renamed from: b, reason: collision with root package name */
        public final yg f5238b;

        public b(int i10, yg ygVar) {
            super(i10);
            this.f5238b = ygVar;
        }
    }

    public i1(int i10) {
        this.a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.a);
    }
}
