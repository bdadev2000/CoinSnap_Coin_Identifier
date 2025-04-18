package com.plantcare.ai.identifier.plantid.domains;

import a4.j;
import com.plantcare.ai.identifier.plantid.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vd.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/SoundDomain;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "id", "J", "getId", "()J", "setId", "(J)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "src", "I", "getSrc", "()I", "setSrc", "(I)V", "<init>", "(JLjava/lang/String;I)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class SoundDomain {
    private long id;
    private String name;
    private int src;

    public SoundDomain(long j3, String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j3;
        this.name = name;
        this.src = i10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoundDomain)) {
            return false;
        }
        SoundDomain soundDomain = (SoundDomain) other;
        return this.id == soundDomain.id && Intrinsics.areEqual(this.name, soundDomain.name) && this.src == soundDomain.src;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSrc() {
        return this.src;
    }

    public int hashCode() {
        return Integer.hashCode(this.src) + e.c(this.name, Long.hashCode(this.id) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SoundDomain(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", src=");
        return j.i(sb2, this.src, ')');
    }

    public /* synthetic */ SoundDomain(long j3, String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j3, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? R.raw.voice_air_horn : i10);
    }
}
