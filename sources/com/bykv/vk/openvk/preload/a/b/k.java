package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.b.a.n;
import com.bykv.vk.openvk.preload.a.m;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public final class k {
    public static com.bykv.vk.openvk.preload.a.k a(com.bykv.vk.openvk.preload.a.d.a aVar) throws o {
        boolean z8;
        try {
            try {
                aVar.f();
                z8 = false;
            } catch (com.bykv.vk.openvk.preload.a.d.d e4) {
                throw new r(e4);
            } catch (IOException e9) {
                throw new com.bykv.vk.openvk.preload.a.l(e9);
            } catch (NumberFormatException e10) {
                throw new r(e10);
            }
        } catch (EOFException e11) {
            e = e11;
            z8 = true;
        }
        try {
            return n.f12946X.a(aVar);
        } catch (EOFException e12) {
            e = e12;
            if (z8) {
                return m.f13130a;
            }
            throw new r(e);
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f13046a;
        private final C0058a b = new C0058a();

        /* renamed from: com.bykv.vk.openvk.preload.a.b.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0058a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            char[] f13047a;

            @Override // java.lang.CharSequence
            public final char charAt(int i9) {
                return this.f13047a[i9];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.f13047a.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i9, int i10) {
                return new String(this.f13047a, i9, i10 - i9);
            }
        }

        public a(Appendable appendable) {
            this.f13046a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i9, int i10) throws IOException {
            C0058a c0058a = this.b;
            c0058a.f13047a = cArr;
            this.f13046a.append(c0058a, i9, i10 + i9);
        }

        @Override // java.io.Writer
        public final void write(int i9) throws IOException {
            this.f13046a.append((char) i9);
        }
    }

    public static void a(com.bykv.vk.openvk.preload.a.k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) throws IOException {
        n.f12946X.a(cVar, kVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
