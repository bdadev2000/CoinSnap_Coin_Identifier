package kotlin.jvm.optionals;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a,\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\u0006\u0010\u0006\u001a\u0002H\u0002H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a6\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0010\b\u0001\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0010\u001a\u0002H\u000eH\u0007¢\u0006\u0002\u0010\u0011\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a$\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u0082\u0002\u000b\n\u0002\b9\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/util/Optional;", "getOrDefault", "defaultValue", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Ljava/util/Optional;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "(Ljava/util/Optional;)Ljava/lang/Object;", "toCollection", "C", "", "destination", "(Ljava/util/Optional;Ljava/util/Collection;)Ljava/util/Collection;", "toList", "", "toSet", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OptionalsKt {
    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> Sequence<T> asSequence(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (optional.isPresent()) {
            return SequencesKt.sequenceOf(optional.get());
        }
        return SequencesKt.emptySequence();
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T getOrDefault(Optional<? extends T> optional, T t5) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (optional.isPresent()) {
            return optional.get();
        }
        return t5;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T getOrElse(Optional<? extends T> optional, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (optional.isPresent()) {
            return optional.get();
        }
        return defaultValue.invoke();
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T getOrNull(Optional<T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, C extends Collection<? super T>> C toCollection(Optional<T> optional, C destination) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (optional.isPresent()) {
            T t5 = optional.get();
            Intrinsics.checkNotNullExpressionValue(t5, "get(...)");
            destination.add(t5);
        }
        return destination;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> List<T> toList(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (optional.isPresent()) {
            return CollectionsKt.listOf(optional.get());
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> Set<T> toSet(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (optional.isPresent()) {
            return SetsKt.setOf(optional.get());
        }
        return SetsKt.emptySet();
    }
}
