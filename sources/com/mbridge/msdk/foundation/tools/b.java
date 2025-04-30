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

/* loaded from: classes3.dex */
public final class b {

    /* loaded from: classes3.dex */
    public final class a {
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16029c;

        public a(String str, boolean z8) {
            this.b = str;
            this.f16029c = z8;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.f16029c;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class ServiceConnectionC0163b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f16030a;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f16031c;

        private ServiceConnectionC0163b() {
            this.f16031c = new LinkedBlockingQueue<>(1);
            this.f16030a = false;
        }

        public final IBinder a() throws InterruptedException {
            if (!this.f16030a) {
                this.f16030a = true;
                return this.f16031c.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f16031c.put(iBinder);
            } catch (InterruptedException e4) {
                ad.b("AdvertisingIdClient", e4.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final a a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC0163b serviceConnectionC0163b = new ServiceConnectionC0163b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, serviceConnectionC0163b, 1)) {
                try {
                    try {
                        c cVar = new c(serviceConnectionC0163b.a());
                        return new a(cVar.a(), cVar.a(true));
                    } catch (Exception e4) {
                        throw e4;
                    }
                } finally {
                    context.unbindService(serviceConnectionC0163b);
                }
            }
            throw new IOException("Google Play connection failed");
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* loaded from: classes3.dex */
    public final class c implements IInterface {
        private IBinder b;

        public c(IBinder iBinder) {
            this.b = iBinder;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } catch (Throwable th) {
                try {
                    ad.b("AdvertisingIdClient", th.getMessage());
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
            return this.b;
        }

        public final boolean a(boolean z8) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z9 = false;
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z8 ? 1 : 0);
                this.b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z9 = true;
                }
            } finally {
                try {
                    return z9;
                } finally {
                }
            }
            return z9;
        }
    }
}
