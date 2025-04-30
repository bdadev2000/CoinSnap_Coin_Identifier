package com.google.firebase.perf.network;

import G7.j;
import android.os.SystemClock;
import androidx.annotation.Keep;
import b1.h;
import b5.e;
import d5.g;
import g5.C2303f;
import h5.i;
import i8.C;
import i8.G;
import i8.I;
import i8.InterfaceC2373j;
import i8.InterfaceC2374k;
import i8.M;
import i8.u;
import i8.x;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m8.f;
import r8.m;

/* loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    public static void a(I i9, e eVar, long j7, long j9) {
        C c9 = i9.b;
        if (c9 == null) {
            return;
        }
        eVar.l(c9.f20754a.h().toString());
        eVar.e(c9.b);
        G g9 = c9.f20756d;
        if (g9 != null) {
            long contentLength = g9.contentLength();
            if (contentLength != -1) {
                eVar.g(contentLength);
            }
        }
        M m = i9.f20779i;
        if (m != null) {
            long contentLength2 = m.contentLength();
            if (contentLength2 != -1) {
                eVar.j(contentLength2);
            }
            x contentType = m.contentType();
            if (contentType != null) {
                eVar.i(contentType.f20895a);
            }
        }
        eVar.f(i9.f20776f);
        eVar.h(j7);
        eVar.k(j9);
        eVar.c();
    }

    @Keep
    public static void enqueue(InterfaceC2373j interfaceC2373j, InterfaceC2374k interfaceC2374k) {
        f fVar;
        i iVar = new i();
        g gVar = new g(interfaceC2374k, C2303f.f20472u, iVar, iVar.b);
        m8.i iVar2 = (m8.i) interfaceC2373j;
        iVar2.getClass();
        if (iVar2.f21788i.compareAndSet(false, true)) {
            m mVar = m.f22950a;
            iVar2.f21789j = m.f22950a.g();
            iVar2.f21786g.getClass();
            h hVar = iVar2.b.b;
            f fVar2 = new f(iVar2, gVar);
            hVar.getClass();
            synchronized (hVar) {
                ((ArrayDeque) hVar.f5270c).add(fVar2);
                if (!iVar2.f21784d) {
                    String str = iVar2.f21783c.f20754a.f20886d;
                    Iterator it = ((ArrayDeque) hVar.f5271d).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fVar = (f) it.next();
                            if (j.a(fVar.f21780d.f21783c.f20754a.f20886d, str)) {
                                break;
                            }
                        } else {
                            Iterator it2 = ((ArrayDeque) hVar.f5270c).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    fVar = (f) it2.next();
                                    if (j.a(fVar.f21780d.f21783c.f20754a.f20886d, str)) {
                                        break;
                                    }
                                } else {
                                    fVar = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (fVar != null) {
                        fVar2.f21779c = fVar.f21779c;
                    }
                }
            }
            hVar.l();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Keep
    public static I execute(InterfaceC2373j interfaceC2373j) throws IOException {
        e eVar = new e(C2303f.f20472u);
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        long micros2 = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
        try {
            I d2 = ((m8.i) interfaceC2373j).d();
            TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            a(d2, eVar, micros, TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - micros2);
            return d2;
        } catch (IOException e4) {
            C c9 = ((m8.i) interfaceC2373j).f21783c;
            if (c9 != null) {
                u uVar = c9.f20754a;
                if (uVar != null) {
                    eVar.l(uVar.h().toString());
                }
                String str = c9.b;
                if (str != null) {
                    eVar.e(str);
                }
            }
            eVar.h(micros);
            TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            eVar.k(TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - micros2);
            d5.h.c(eVar);
            throw e4;
        }
    }
}
