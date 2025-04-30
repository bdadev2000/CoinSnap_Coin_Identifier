package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GeofencingEvent {
    private final int zza;

    @Geofence.GeofenceTransition
    private final int zzb;
    private final List<Geofence> zzc;
    private final Location zzd;

    private GeofencingEvent(int i9, @Geofence.GeofenceTransition int i10, List<Geofence> list, Location location) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = list;
        this.zzd = location;
    }

    @NonNull
    public static GeofencingEvent fromIntent(@NonNull Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i9 = -1;
        int intExtra = intent.getIntExtra(Constants.KEY_GMS_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 != 1 && intExtra2 != 2) {
                if (intExtra2 == 4) {
                    i9 = 4;
                }
            } else {
                i9 = intExtra2;
            }
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                byte[] bArr = (byte[]) arrayList2.get(i10);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                com.google.android.gms.internal.location.zzbe createFromParcel = com.google.android.gms.internal.location.zzbe.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                arrayList.add(createFromParcel);
            }
        }
        return new GeofencingEvent(intExtra, i9, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    public int getErrorCode() {
        return this.zza;
    }

    @Geofence.GeofenceTransition
    public int getGeofenceTransition() {
        return this.zzb;
    }

    @NonNull
    public List<Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    @NonNull
    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}
