package com.cooldev.gba.emulator.gameboy.features.game.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SaveState {
    public static final int $stable = 8;

    @NotNull
    private final Metadata metadata;

    @NotNull
    private final byte[] state;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Metadata implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Metadata> CREATOR = new Creator();
        private final int diskIndex;
        private final int version;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Metadata> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Metadata createFromParcel(@NotNull Parcel parcel) {
                a.s(parcel, "parcel");
                return new Metadata(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Metadata[] newArray(int i2) {
                return new Metadata[i2];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Metadata() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.models.SaveState.Metadata.<init>():void");
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = metadata.diskIndex;
            }
            if ((i4 & 2) != 0) {
                i3 = metadata.version;
            }
            return metadata.copy(i2, i3);
        }

        public final int component1() {
            return this.diskIndex;
        }

        public final int component2() {
            return this.version;
        }

        @NotNull
        public final Metadata copy(int i2, int i3) {
            return new Metadata(i2, i3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return this.diskIndex == metadata.diskIndex && this.version == metadata.version;
        }

        public final int getDiskIndex() {
            return this.diskIndex;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return Integer.hashCode(this.version) + (Integer.hashCode(this.diskIndex) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Metadata(diskIndex=");
            sb.append(this.diskIndex);
            sb.append(", version=");
            return d.o(sb, this.version, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i2) {
            a.s(parcel, "out");
            parcel.writeInt(this.diskIndex);
            parcel.writeInt(this.version);
        }

        public Metadata(int i2, int i3) {
            this.diskIndex = i2;
            this.version = i3;
        }

        public /* synthetic */ Metadata(int i2, int i3, int i4, k kVar) {
            this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
        }
    }

    public SaveState(@NotNull byte[] bArr, @NotNull Metadata metadata) {
        a.s(bArr, "state");
        a.s(metadata, "metadata");
        this.state = bArr;
        this.metadata = metadata;
    }

    @NotNull
    public final Metadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final byte[] getState() {
        return this.state;
    }
}
