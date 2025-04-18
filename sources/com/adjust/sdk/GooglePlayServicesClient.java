package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class GooglePlayServicesClient {

    /* loaded from: classes.dex */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements ServiceConnection {
        public long a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2851b = false;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f2852c = new LinkedBlockingQueue<>(1);

        public a(long j3) {
            this.a = j3;
        }

        public final IBinder a() {
            if (this.f2851b) {
                throw new IllegalStateException();
            }
            this.f2851b = true;
            return this.f2852c.poll(this.a, TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f2852c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j3) {
        Boolean bool;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            boolean z10 = false;
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a(j3);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aVar, 1)) {
                    try {
                        IBinder a10 = aVar.a();
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            a10.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            String readString = obtain2.readString();
                            obtain2.recycle();
                            obtain.recycle();
                            obtain = Parcel.obtain();
                            obtain2 = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                obtain.writeInt(1);
                                a10.transact(2, obtain, obtain2, 0);
                                obtain2.readException();
                                if (obtain2.readInt() != 0) {
                                    z10 = true;
                                }
                                if (Boolean.valueOf(z10) != null) {
                                    bool = Boolean.valueOf(!r8.booleanValue());
                                } else {
                                    bool = null;
                                }
                                return new GooglePlayServicesInfo(readString, bool);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(aVar);
            }
        }
        throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
    }
}
