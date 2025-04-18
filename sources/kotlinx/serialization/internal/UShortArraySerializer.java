package kotlinx.serialization.internal;

import com.applovin.sdk.AppLovinEventTypes;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0014ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0014ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001fø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/UShortArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShortArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UShort;", "Lkotlinx/serialization/internal/UShortArrayBuilder;", "()V", "empty", "empty-amswpOA", "()[S", "readElement", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "", "builder", "checkIndex", "", "writeContent", "encoder", "Lkotlinx/serialization/encoding/CompositeEncoder;", AppLovinEventTypes.USER_VIEWED_CONTENT, "size", "writeContent-eny0XGE", "(Lkotlinx/serialization/encoding/CompositeEncoder;[SI)V", "collectionSize", "collectionSize-rL5Bavg", "([S)I", "toBuilder", "toBuilder-rL5Bavg", "([S)Lkotlinx/serialization/internal/UShortArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
/* loaded from: classes5.dex */
public final class UShortArraySerializer extends PrimitiveArraySerializer<UShort, UShortArray, UShortArrayBuilder> {
    public static final UShortArraySerializer INSTANCE = new UShortArraySerializer();

    private UShortArraySerializer() {
        super(BuiltinSerializersKt.serializer(UShort.INSTANCE));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m1758collectionSizerL5Bavg(((UShortArray) obj).getStorage());
    }

    /* renamed from: collectionSize-rL5Bavg, reason: not valid java name */
    public int m1758collectionSizerL5Bavg(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m485getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ UShortArray empty() {
        return UShortArray.m477boximpl(m1759emptyamswpOA());
    }

    /* renamed from: empty-amswpOA, reason: not valid java name */
    public short[] m1759emptyamswpOA() {
        return UShortArray.m478constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m1760toBuilderrL5Bavg(((UShortArray) obj).getStorage());
    }

    /* renamed from: toBuilder-rL5Bavg, reason: not valid java name */
    public UShortArrayBuilder m1760toBuilderrL5Bavg(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UShortArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, UShortArray uShortArray, int i10) {
        m1761writeContenteny0XGE(compositeEncoder, uShortArray.getStorage(), i10);
    }

    /* renamed from: writeContent-eny0XGE, reason: not valid java name */
    public void m1761writeContenteny0XGE(CompositeEncoder encoder, short[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.encodeInlineElement(getDescriptor(), i10).encodeShort(UShortArray.m484getMh2AYeg(content, i10));
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, UShortArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m1756appendxj2QHRw$kotlinx_serialization_core(UShort.m426constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeShort()));
    }
}
