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
        boolean z10;
        try {
            try {
                aVar.f();
                z10 = false;
                try {
                    return n.X.a(aVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z10) {
                        return m.a;
                    }
                    throw new r(e);
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e10) {
                throw new r(e10);
            } catch (IOException e11) {
                throw new com.bykv.vk.openvk.preload.a.l(e11);
            } catch (NumberFormatException e12) {
                throw new r(e12);
            }
        } catch (EOFException e13) {
            e = e13;
            z10 = true;
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends Writer {
        private final Appendable a;

        /* renamed from: b, reason: collision with root package name */
        private final C0050a f9885b = new C0050a();

        /* renamed from: com.bykv.vk.openvk.preload.a.b.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0050a implements CharSequence {
            char[] a;

            @Override // java.lang.CharSequence
            public final char charAt(int i10) {
                return this.a[i10];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.a.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i10, int i11) {
                return new String(this.a, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) throws IOException {
            C0050a c0050a = this.f9885b;
            c0050a.a = cArr;
            this.a.append(c0050a, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public final void write(int i10) throws IOException {
            this.a.append((char) i10);
        }
    }

    public static void a(com.bykv.vk.openvk.preload.a.k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) throws IOException {
        n.X.a(cVar, kVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
