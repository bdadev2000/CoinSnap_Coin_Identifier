package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class zzde extends zzbx implements zzdb {
    public zzde() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzdb) {
            return (zzdb) queryLocalInterface;
        }
        return new zzdd(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzdg zzdiVar;
        zzdg zzdgVar;
        zzdg zzdgVar2 = null;
        zzdg zzdgVar3 = null;
        zzdg zzdgVar4 = null;
        zzdg zzdgVar5 = null;
        zzdh zzdhVar = null;
        zzdh zzdhVar2 = null;
        zzdh zzdhVar3 = null;
        zzdg zzdgVar6 = null;
        zzdg zzdgVar7 = null;
        zzdg zzdgVar8 = null;
        zzdg zzdgVar9 = null;
        zzdg zzdgVar10 = null;
        zzdg zzdgVar11 = null;
        zzdm zzdmVar = null;
        zzdg zzdgVar12 = null;
        zzdg zzdgVar13 = null;
        zzdg zzdgVar14 = null;
        zzdg zzdgVar15 = null;
        switch (i9) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzdo zzdoVar = (zzdo) zzbw.zza(parcel, zzdo.CREATOR);
                long readLong = parcel.readLong();
                zzbw.zzb(parcel);
                initialize(asInterface, zzdoVar, readLong);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                boolean zzc = zzbw.zzc(parcel);
                boolean zzc2 = zzbw.zzc(parcel);
                long readLong2 = parcel.readLong();
                zzbw.zzb(parcel);
                logEvent(readString, readString2, bundle, zzc, zzc2, readLong2);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdgVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzdg) {
                        zzdiVar = (zzdg) queryLocalInterface;
                    } else {
                        zzdiVar = new zzdi(readStrongBinder);
                    }
                    zzdgVar = zzdiVar;
                }
                long readLong3 = parcel.readLong();
                zzbw.zzb(parcel);
                logEventAndBundle(readString3, readString4, bundle2, zzdgVar, readLong3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzc3 = zzbw.zzc(parcel);
                long readLong4 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserProperty(readString5, readString6, asInterface2, zzc3, readLong4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzc4 = zzbw.zzc(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzdg) {
                        zzdgVar2 = (zzdg) queryLocalInterface2;
                    } else {
                        zzdgVar2 = new zzdi(readStrongBinder2);
                    }
                }
                zzbw.zzb(parcel);
                getUserProperties(readString7, readString8, zzc4, zzdgVar2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzdg) {
                        zzdgVar15 = (zzdg) queryLocalInterface3;
                    } else {
                        zzdgVar15 = new zzdi(readStrongBinder3);
                    }
                }
                zzbw.zzb(parcel);
                getMaxUserProperties(readString9, zzdgVar15);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserId(readString10, readLong5);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle3 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                zzbw.zzb(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                parcel2.writeNoException();
                return true;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzdg) {
                        zzdgVar14 = (zzdg) queryLocalInterface4;
                    } else {
                        zzdgVar14 = new zzdi(readStrongBinder4);
                    }
                }
                zzbw.zzb(parcel);
                getConditionalUserProperties(readString13, readString14, zzdgVar14);
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzc5 = zzbw.zzc(parcel);
                long readLong7 = parcel.readLong();
                zzbw.zzb(parcel);
                setMeasurementEnabled(zzc5, readLong7);
                parcel2.writeNoException();
                return true;
            case 12:
                long readLong8 = parcel.readLong();
                zzbw.zzb(parcel);
                resetAnalyticsData(readLong8);
                parcel2.writeNoException();
                return true;
            case 13:
                long readLong9 = parcel.readLong();
                zzbw.zzb(parcel);
                setMinimumSessionDuration(readLong9);
                parcel2.writeNoException();
                return true;
            case 14:
                long readLong10 = parcel.readLong();
                zzbw.zzb(parcel);
                setSessionTimeoutDuration(readLong10);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                zzbw.zzb(parcel);
                setCurrentScreen(asInterface3, readString15, readString16, readLong11);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzdg) {
                        zzdgVar13 = (zzdg) queryLocalInterface5;
                    } else {
                        zzdgVar13 = new zzdi(readStrongBinder5);
                    }
                }
                zzbw.zzb(parcel);
                getCurrentScreenName(zzdgVar13);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzdg) {
                        zzdgVar12 = (zzdg) queryLocalInterface6;
                    } else {
                        zzdgVar12 = new zzdi(readStrongBinder6);
                    }
                }
                zzbw.zzb(parcel);
                getCurrentScreenClass(zzdgVar12);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzdm) {
                        zzdmVar = (zzdm) queryLocalInterface7;
                    } else {
                        zzdmVar = new zzdl(readStrongBinder7);
                    }
                }
                zzbw.zzb(parcel);
                setInstanceIdProvider(zzdmVar);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzdg) {
                        zzdgVar11 = (zzdg) queryLocalInterface8;
                    } else {
                        zzdgVar11 = new zzdi(readStrongBinder8);
                    }
                }
                zzbw.zzb(parcel);
                getCachedAppInstanceId(zzdgVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzdg) {
                        zzdgVar10 = (zzdg) queryLocalInterface9;
                    } else {
                        zzdgVar10 = new zzdi(readStrongBinder9);
                    }
                }
                zzbw.zzb(parcel);
                getAppInstanceId(zzdgVar10);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzdg) {
                        zzdgVar9 = (zzdg) queryLocalInterface10;
                    } else {
                        zzdgVar9 = new zzdi(readStrongBinder10);
                    }
                }
                zzbw.zzb(parcel);
                getGmpAppId(zzdgVar9);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzdg) {
                        zzdgVar8 = (zzdg) queryLocalInterface11;
                    } else {
                        zzdgVar8 = new zzdi(readStrongBinder11);
                    }
                }
                zzbw.zzb(parcel);
                generateEventId(zzdgVar8);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                zzbw.zzb(parcel);
                beginAdUnitExposure(readString17, readLong12);
                parcel2.writeNoException();
                return true;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                zzbw.zzb(parcel);
                endAdUnitExposure(readString18, readLong13);
                parcel2.writeNoException();
                return true;
            case 25:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStarted(asInterface4, readLong14);
                parcel2.writeNoException();
                return true;
            case 26:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStopped(asInterface5, readLong15);
                parcel2.writeNoException();
                return true;
            case 27:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityCreated(asInterface6, bundle5, readLong16);
                parcel2.writeNoException();
                return true;
            case 28:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityDestroyed(asInterface7, readLong17);
                parcel2.writeNoException();
                return true;
            case 29:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityPaused(asInterface8, readLong18);
                parcel2.writeNoException();
                return true;
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityResumed(asInterface9, readLong19);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzdg) {
                        zzdgVar7 = (zzdg) queryLocalInterface12;
                    } else {
                        zzdgVar7 = new zzdi(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivitySaveInstanceState(asInterface10, zzdgVar7, readLong20);
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle6 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzdg) {
                        zzdgVar6 = (zzdg) queryLocalInterface13;
                    } else {
                        zzdgVar6 = new zzdi(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                zzbw.zzb(parcel);
                performAction(bundle6, zzdgVar6, readLong21);
                parcel2.writeNoException();
                return true;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbw.zzb(parcel);
                logHealthData(readInt, readString19, asInterface11, asInterface12, asInterface13);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzdh) {
                        zzdhVar3 = (zzdh) queryLocalInterface14;
                    } else {
                        zzdhVar3 = new zzdj(readStrongBinder14);
                    }
                }
                zzbw.zzb(parcel);
                setEventInterceptor(zzdhVar3);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzdh) {
                        zzdhVar2 = (zzdh) queryLocalInterface15;
                    } else {
                        zzdhVar2 = new zzdj(readStrongBinder15);
                    }
                }
                zzbw.zzb(parcel);
                registerOnMeasurementEventListener(zzdhVar2);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzdh) {
                        zzdhVar = (zzdh) queryLocalInterface16;
                    } else {
                        zzdhVar = new zzdj(readStrongBinder16);
                    }
                }
                zzbw.zzb(parcel);
                unregisterOnMeasurementEventListener(zzdhVar);
                parcel2.writeNoException();
                return true;
            case 37:
                HashMap zza = zzbw.zza(parcel);
                zzbw.zzb(parcel);
                initForTests(zza);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzdg) {
                        zzdgVar5 = (zzdg) queryLocalInterface17;
                    } else {
                        zzdgVar5 = new zzdi(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                zzbw.zzb(parcel);
                getTestFlag(zzdgVar5, readInt2);
                parcel2.writeNoException();
                return true;
            case 39:
                boolean zzc6 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                setDataCollectionEnabled(zzc6);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof zzdg) {
                        zzdgVar4 = (zzdg) queryLocalInterface18;
                    } else {
                        zzdgVar4 = new zzdi(readStrongBinder18);
                    }
                }
                zzbw.zzb(parcel);
                isDataCollectionEnabled(zzdgVar4);
                parcel2.writeNoException();
                return true;
            case 41:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                setDefaultEventParameters(bundle7);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                long readLong22 = parcel.readLong();
                zzbw.zzb(parcel);
                clearMeasurementEnabled(readLong22);
                parcel2.writeNoException();
                return true;
            case 44:
                Bundle bundle8 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsent(bundle8, readLong23);
                parcel2.writeNoException();
                return true;
            case 45:
                Bundle bundle9 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsentThirdParty(bundle9, readLong24);
                parcel2.writeNoException();
                return true;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof zzdg) {
                        zzdgVar3 = (zzdg) queryLocalInterface19;
                    } else {
                        zzdgVar3 = new zzdi(readStrongBinder19);
                    }
                }
                zzbw.zzb(parcel);
                getSessionId(zzdgVar3);
                parcel2.writeNoException();
                return true;
            case 48:
                Intent intent = (Intent) zzbw.zza(parcel, Intent.CREATOR);
                zzbw.zzb(parcel);
                setSgtmDebugInfo(intent);
                parcel2.writeNoException();
                return true;
        }
    }
}
