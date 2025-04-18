package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public final class b {

    /* loaded from: classes4.dex */
    public final class a {

        /* renamed from: b, reason: collision with root package name */
        private final String f13585b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f13586c;

        public a(String str, boolean z10) {
            this.f13585b = str;
            this.f13586c = z10;
        }

        public final String a() {
            return this.f13585b;
        }

        public final boolean b() {
            return this.f13586c;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public final class ServiceConnectionC0175b implements ServiceConnection {
        boolean a;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f13588c;

        private ServiceConnectionC0175b() {
            this.f13588c = new LinkedBlockingQueue<>(1);
            this.a = false;
        }

        public final IBinder a() throws InterruptedException {
            if (!this.a) {
                this.a = true;
                return this.f13588c.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f13588c.put(iBinder);
            } catch (InterruptedException e2) {
                ad.b("AdvertisingIdClient", e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final a a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC0175b serviceConnectionC0175b = new ServiceConnectionC0175b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, serviceConnectionC0175b, 1)) {
                try {
                    try {
                        c cVar = new c(serviceConnectionC0175b.a());
                        return new a(cVar.a(), cVar.a(true));
                    } catch (Exception e2) {
                        throw e2;
                    }
                } finally {
                    context.unbindService(serviceConnectionC0175b);
                }
            }
            throw new IOException("Google Play connection failed");
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* loaded from: classes4.dex */
    public final class c implements IInterface {

        /* renamed from: b, reason: collision with root package name */
        private IBinder f13589b;

        public c(IBinder iBinder) {
            this.f13589b = iBinder;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f13589b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } catch (Throwable th2) {
                try {
                    ad.b("AdvertisingIdClient", th2.getMessage());
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f13589b;
        }

        public final boolean a(boolean z10) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z11 = false;
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z10 ? 1 : 0);
                this.f13589b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z11 = true;
                }
            } finally {
                try {
                    return z11;
                } finally {
                }
            }
            return z11;
        }
    }
}
