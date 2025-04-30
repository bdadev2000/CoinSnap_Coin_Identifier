package com.applovin.impl;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0708i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8200a;

    /* renamed from: com.applovin.impl.i1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC0708i1 {
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final List f8201c;

        /* renamed from: d, reason: collision with root package name */
        public final List f8202d;

        public a(int i9, long j7) {
            super(i9);
            this.b = j7;
            this.f8201c = new ArrayList();
            this.f8202d = new ArrayList();
        }

        public void a(a aVar) {
            this.f8202d.add(aVar);
        }

        public a d(int i9) {
            int size = this.f8202d.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.f8202d.get(i10);
                if (aVar.f8200a == i9) {
                    return aVar;
                }
            }
            return null;
        }

        public b e(int i9) {
            int size = this.f8201c.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) this.f8201c.get(i10);
                if (bVar.f8200a == i9) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.applovin.impl.AbstractC0708i1
        public String toString() {
            return AbstractC0708i1.a(this.f8200a) + " leaves: " + Arrays.toString(this.f8201c.toArray()) + " containers: " + Arrays.toString(this.f8202d.toArray());
        }

        public void a(b bVar) {
            this.f8201c.add(bVar);
        }
    }

    /* renamed from: com.applovin.impl.i1$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0708i1 {
        public final yg b;

        public b(int i9, yg ygVar) {
            super(i9);
            this.b = ygVar;
        }
    }

    public AbstractC0708i1(int i9) {
        this.f8200a = i9;
    }

    public static String a(int i9) {
        return "" + ((char) ((i9 >> 24) & 255)) + ((char) ((i9 >> 16) & 255)) + ((char) ((i9 >> 8) & 255)) + ((char) (i9 & 255));
    }

    public static int b(int i9) {
        return i9 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int c(int i9) {
        return (i9 >> 24) & 255;
    }

    public String toString() {
        return a(this.f8200a);
    }
}
