package com.plantcare.ai.identifier.plantid.data.database.entities;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import com.applovin.impl.mediation.ads.e;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class AlarmEntity implements Parcelable, Serializable {
    public static final Parcelable.Creator<AlarmEntity> CREATOR = new Parcelable.Creator<AlarmEntity>() { // from class: com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlarmEntity createFromParcel(Parcel parcel) {
            return new AlarmEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlarmEntity[] newArray(int i10) {
            return new AlarmEntity[i10];
        }
    };
    private SparseBooleanArray allDays;
    private String description;

    /* renamed from: id, reason: collision with root package name */
    private long f16597id;
    private boolean isEnabled;
    private boolean isVibration;
    private String label;
    private int soundRes;
    private long time;
    private int type;

    private static SparseBooleanArray buildBaseDaysArray() {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(7);
        sparseBooleanArray.put(1, false);
        sparseBooleanArray.put(2, false);
        sparseBooleanArray.put(3, false);
        sparseBooleanArray.put(4, false);
        sparseBooleanArray.put(5, false);
        sparseBooleanArray.put(6, false);
        sparseBooleanArray.put(7, false);
        return sparseBooleanArray;
    }

    private static SparseBooleanArray buildDaysArray(int... iArr) {
        SparseBooleanArray buildBaseDaysArray = buildBaseDaysArray();
        for (int i10 : iArr) {
            buildBaseDaysArray.append(i10, true);
        }
        return buildBaseDaysArray;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SparseBooleanArray getAllDays() {
        return this.allDays;
    }

    public boolean getDay(int i10) {
        return this.allDays.get(i10);
    }

    public SparseBooleanArray getDays() {
        return this.allDays;
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.f16597id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getSoundRes() {
        return this.soundRes;
    }

    public long getTime() {
        return this.time;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        long j3 = this.f16597id;
        long j10 = this.time;
        int hashCode = this.label.hashCode() + ((((527 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        for (int i10 = 0; i10 < this.allDays.size(); i10++) {
            hashCode = (hashCode * 31) + (this.allDays.valueAt(i10) ? 1 : 0);
        }
        return hashCode;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean isVibration() {
        return this.isVibration;
    }

    public int notificationId() {
        long id2 = getId();
        return (int) (id2 ^ (id2 >>> 32));
    }

    public void setAllDays(SparseBooleanArray sparseBooleanArray) {
        this.allDays = sparseBooleanArray;
    }

    public void setDay(int i10, boolean z10) {
        this.allDays.append(i10, z10);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(long j3) {
        this.f16597id = j3;
    }

    public void setIsEnabled(boolean z10) {
        this.isEnabled = z10;
    }

    public void setIsVibration(boolean z10) {
        this.isVibration = z10;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setSoundRes(int i10) {
        this.soundRes = i10;
    }

    public void setTime(long j3) {
        this.time = j3;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Alarm{id=");
        sb2.append(this.f16597id);
        sb2.append(", time=");
        sb2.append(this.time);
        sb2.append(", label='");
        sb2.append(this.label);
        sb2.append("', allDays=");
        sb2.append(this.allDays);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isVibration=");
        sb2.append(this.isVibration);
        sb2.append(", Sound Id: ");
        sb2.append(this.soundRes);
        sb2.append(", Des: ");
        return e.g(sb2, this.description, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16597id);
        parcel.writeLong(this.time);
        parcel.writeString(this.label);
        parcel.writeSparseBooleanArray(this.allDays);
        parcel.writeInt(this.soundRes);
        parcel.writeByte(this.isEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isVibration ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.type);
    }

    private AlarmEntity(Parcel parcel) {
        this.f16597id = parcel.readLong();
        this.time = parcel.readLong();
        this.label = parcel.readString();
        this.description = parcel.readString();
        this.allDays = parcel.readSparseBooleanArray();
        this.soundRes = parcel.readInt();
        this.isEnabled = parcel.readByte() != 0;
        this.isVibration = parcel.readByte() != 0;
        this.type = parcel.readInt();
    }

    public AlarmEntity() {
        this(-1L, 0);
    }

    public AlarmEntity(long j3, int i10) {
        this(j3, System.currentTimeMillis(), i10, new int[0]);
    }

    public AlarmEntity(long j3, long j10, int i10, int... iArr) {
        this(j3, j10, null, null, 0, i10, iArr);
    }

    public AlarmEntity(long j3, long j10, String str, String str2, int i10, int i11, int... iArr) {
        this.f16597id = j3;
        this.time = j10;
        this.label = str;
        this.description = str2;
        this.soundRes = i10;
        this.allDays = buildDaysArray(iArr);
        this.type = i11;
    }
}
