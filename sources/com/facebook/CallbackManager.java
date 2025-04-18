package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface CallbackManager {

    /* loaded from: classes2.dex */
    public static final class ActivityResultParameters {

        @Nullable
        private final Intent data;
        private final int requestCode;
        private final int resultCode;

        public ActivityResultParameters(int i2, int i3, @Nullable Intent intent) {
            this.requestCode = i2;
            this.resultCode = i3;
            this.data = intent;
        }

        public static /* synthetic */ ActivityResultParameters copy$default(ActivityResultParameters activityResultParameters, int i2, int i3, Intent intent, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = activityResultParameters.requestCode;
            }
            if ((i4 & 2) != 0) {
                i3 = activityResultParameters.resultCode;
            }
            if ((i4 & 4) != 0) {
                intent = activityResultParameters.data;
            }
            return activityResultParameters.copy(i2, i3, intent);
        }

        public final int component1() {
            return this.requestCode;
        }

        public final int component2() {
            return this.resultCode;
        }

        @Nullable
        public final Intent component3() {
            return this.data;
        }

        @NotNull
        public final ActivityResultParameters copy(int i2, int i3, @Nullable Intent intent) {
            return new ActivityResultParameters(i2, i3, intent);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityResultParameters)) {
                return false;
            }
            ActivityResultParameters activityResultParameters = (ActivityResultParameters) obj;
            return this.requestCode == activityResultParameters.requestCode && this.resultCode == activityResultParameters.resultCode && p0.a.g(this.data, activityResultParameters.data);
        }

        @Nullable
        public final Intent getData() {
            return this.data;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final int getResultCode() {
            return this.resultCode;
        }

        public int hashCode() {
            int c2 = android.support.v4.media.d.c(this.resultCode, Integer.hashCode(this.requestCode) * 31, 31);
            Intent intent = this.data;
            return c2 + (intent == null ? 0 : intent.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class Factory {

        @NotNull
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @NotNull
        public static final CallbackManager create() {
            return new CallbackManagerImpl();
        }
    }

    boolean onActivityResult(int i2, int i3, @Nullable Intent intent);
}
