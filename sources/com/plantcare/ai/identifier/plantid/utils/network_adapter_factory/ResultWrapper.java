package com.plantcare.ai.identifier.plantid.utils.network_adapter_factory;

import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "()V", "GenericError", "NetworkError", "Success", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper$GenericError;", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper$NetworkError;", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper$Success;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ResultWrapper<T> {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper$GenericError;", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "", "", "toString", "", "hashCode", "", "other", "", "equals", "code", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "error", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final /* data */ class GenericError extends ResultWrapper {
        private final Integer code;
        private final String error;

        public GenericError(Integer num, String str) {
            super(null);
            this.code = num;
            this.error = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenericError)) {
                return false;
            }
            GenericError genericError = (GenericError) other;
            return Intrinsics.areEqual(this.code, genericError.code) && Intrinsics.areEqual(this.error, genericError.error);
        }

        public int hashCode() {
            Integer num = this.code;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.error;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("GenericError(code=");
            sb2.append(this.code);
            sb2.append(", error=");
            return e.g(sb2, this.error, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper$NetworkError;", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class NetworkError extends ResultWrapper {
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkError)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1122201434;
        }

        public String toString() {
            return "NetworkError";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000b\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper$Success;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "", "toString", "", "hashCode", "", "other", "", "equals", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final /* data */ class Success<T> extends ResultWrapper<T> {
        private final T value;

        public Success(T t5) {
            super(null);
            this.value = t5;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t5 = this.value;
            if (t5 == null) {
                return 0;
            }
            return t5.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ')';
        }
    }

    private ResultWrapper() {
    }

    public /* synthetic */ ResultWrapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
