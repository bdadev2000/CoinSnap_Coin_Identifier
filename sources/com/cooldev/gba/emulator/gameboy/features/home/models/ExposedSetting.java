package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ExposedSetting implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private final String key;
    private final int titleId;

    @NotNull
    private final ArrayList<Value> values;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Value implements Serializable {
        public static final int $stable = 0;

        @NotNull
        private final String key;
        private final int titleId;

        public Value(@NotNull String str, int i2) {
            a.s(str, SDKConstants.PARAM_KEY);
            this.key = str;
            this.titleId = i2;
        }

        public static /* synthetic */ Value copy$default(Value value, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = value.key;
            }
            if ((i3 & 2) != 0) {
                i2 = value.titleId;
            }
            return value.copy(str, i2);
        }

        @NotNull
        public final String component1() {
            return this.key;
        }

        public final int component2() {
            return this.titleId;
        }

        @NotNull
        public final Value copy(@NotNull String str, int i2) {
            a.s(str, SDKConstants.PARAM_KEY);
            return new Value(str, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return a.g(this.key, value.key) && this.titleId == value.titleId;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public final int getTitleId() {
            return this.titleId;
        }

        public int hashCode() {
            return Integer.hashCode(this.titleId) + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Value(key=");
            sb.append(this.key);
            sb.append(", titleId=");
            return d.o(sb, this.titleId, ')');
        }
    }

    public ExposedSetting(@NotNull String str, int i2, @NotNull ArrayList<Value> arrayList) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(arrayList, "values");
        this.key = str;
        this.titleId = i2;
        this.values = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExposedSetting copy$default(ExposedSetting exposedSetting, String str, int i2, ArrayList arrayList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = exposedSetting.key;
        }
        if ((i3 & 2) != 0) {
            i2 = exposedSetting.titleId;
        }
        if ((i3 & 4) != 0) {
            arrayList = exposedSetting.values;
        }
        return exposedSetting.copy(str, i2, arrayList);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    public final int component2() {
        return this.titleId;
    }

    @NotNull
    public final ArrayList<Value> component3() {
        return this.values;
    }

    @NotNull
    public final ExposedSetting copy(@NotNull String str, int i2, @NotNull ArrayList<Value> arrayList) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(arrayList, "values");
        return new ExposedSetting(str, i2, arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposedSetting)) {
            return false;
        }
        ExposedSetting exposedSetting = (ExposedSetting) obj;
        return a.g(this.key, exposedSetting.key) && this.titleId == exposedSetting.titleId && a.g(this.values, exposedSetting.values);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    @NotNull
    public final ArrayList<Value> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + d.c(this.titleId, this.key.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ExposedSetting(key=" + this.key + ", titleId=" + this.titleId + ", values=" + this.values + ')';
    }

    public /* synthetic */ ExposedSetting(String str, int i2, ArrayList arrayList, int i3, k kVar) {
        this(str, i2, (i3 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
