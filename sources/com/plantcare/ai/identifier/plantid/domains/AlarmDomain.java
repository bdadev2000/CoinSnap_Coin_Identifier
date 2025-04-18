package com.plantcare.ai.identifier.plantid.domains;

import a4.j;
import android.util.SparseBooleanArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import vd.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0007\u0012\b\b\u0002\u0010.\u001a\u00020\u0007¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-¨\u00062"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/AlarmDomain;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "id", "J", "getId", "()J", "setId", "(J)V", "time", "getTime", "setTime", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "Landroid/util/SparseBooleanArray;", "allDays", "Landroid/util/SparseBooleanArray;", "getAllDays", "()Landroid/util/SparseBooleanArray;", "setAllDays", "(Landroid/util/SparseBooleanArray;)V", "soundRes", "I", "getSoundRes", "()I", "setSoundRes", "(I)V", "isEnabled", "Z", "()Z", "setEnabled", "(Z)V", "isVibration", "setVibration", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Landroid/util/SparseBooleanArray;IZZ)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class AlarmDomain {
    private SparseBooleanArray allDays;
    private String description;
    private long id;
    private boolean isEnabled;
    private boolean isVibration;
    private String label;
    private int soundRes;
    private long time;

    public AlarmDomain(long j3, long j10, String label, String description, SparseBooleanArray allDays, int i10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(allDays, "allDays");
        this.id = j3;
        this.time = j10;
        this.label = label;
        this.description = description;
        this.allDays = allDays;
        this.soundRes = i10;
        this.isEnabled = z10;
        this.isVibration = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmDomain)) {
            return false;
        }
        AlarmDomain alarmDomain = (AlarmDomain) other;
        return this.id == alarmDomain.id && this.time == alarmDomain.time && Intrinsics.areEqual(this.label, alarmDomain.label) && Intrinsics.areEqual(this.description, alarmDomain.description) && Intrinsics.areEqual(this.allDays, alarmDomain.allDays) && this.soundRes == alarmDomain.soundRes && this.isEnabled == alarmDomain.isEnabled && this.isVibration == alarmDomain.isVibration;
    }

    public final SparseBooleanArray getAllDays() {
        return this.allDays;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getSoundRes() {
        return this.soundRes;
    }

    public final long getTime() {
        return this.time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int e2 = a.e(this.soundRes, (this.allDays.hashCode() + e.c(this.description, e.c(this.label, (Long.hashCode(this.time) + (Long.hashCode(this.id) * 31)) * 31, 31), 31)) * 31, 31);
        boolean z10 = this.isEnabled;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (e2 + i11) * 31;
        boolean z11 = this.isVibration;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i12 + i10;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: isVibration, reason: from getter */
    public final boolean getIsVibration() {
        return this.isVibration;
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlarmDomain(id=");
        sb2.append(this.id);
        sb2.append(", time=");
        sb2.append(this.time);
        sb2.append(", label=");
        sb2.append(this.label);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", allDays=");
        sb2.append(this.allDays);
        sb2.append(", soundRes=");
        sb2.append(this.soundRes);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isVibration=");
        return j.l(sb2, this.isVibration, ')');
    }
}
