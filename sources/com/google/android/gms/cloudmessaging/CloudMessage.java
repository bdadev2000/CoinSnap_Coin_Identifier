package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Objects;
import r.b;

@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes3.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @NonNull
    @SafeParcelable.Field(id = 1)
    final Intent zza;
    private Map zzb;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public CloudMessage(@NonNull @SafeParcelable.Param(id = 1) Intent intent) {
        this.zza = intent;
    }

    private static int zzb(@Nullable String str) {
        if (Objects.equals(str, Constants.HIGH)) {
            return 1;
        }
        if (Objects.equals(str, Constants.NORMAL)) {
            return 2;
        }
        return 0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.zza.getStringExtra("collapse_key");
    }

    @NonNull
    public synchronized Map<String, String> getData() {
        if (this.zzb == null) {
            Bundle extras = this.zza.getExtras();
            b bVar = new b();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith("google.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                            bVar.put(str, str2);
                        }
                    }
                }
            }
            this.zzb = bVar;
        }
        return this.zzb;
    }

    @Nullable
    public String getFrom() {
        return this.zza.getStringExtra("from");
    }

    @NonNull
    public Intent getIntent() {
        return this.zza;
    }

    @Nullable
    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return this.zza.getStringExtra("message_id");
        }
        return stringExtra;
    }

    @Nullable
    public String getMessageType() {
        return this.zza.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra("google.original_priority");
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zzb(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.zza.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if (Objects.equals(this.zza.getStringExtra("google.priority_reduced"), "1")) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zzb(stringExtra);
    }

    @Nullable
    public byte[] getRawData() {
        return this.zza.getByteArrayExtra("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.zza.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        Object obj;
        Bundle extras = this.zza.getExtras();
        if (extras != null) {
            obj = extras.get("google.sent_time");
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("CloudMessage", "Invalid sent time: ".concat(String.valueOf(obj)));
                return 0L;
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.zza.getStringExtra("google.to");
    }

    public int getTtl() {
        Object obj;
        Bundle extras = this.zza.getExtras();
        if (extras != null) {
            obj = extras.get("google.ttl");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("CloudMessage", "Invalid TTL: ".concat(String.valueOf(obj)));
                return 0;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final Integer zza() {
        if (this.zza.hasExtra("google.product_id")) {
            return Integer.valueOf(this.zza.getIntExtra("google.product_id", 0));
        }
        return null;
    }
}
