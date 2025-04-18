package com.plantcare.ai.identifier.plantid.data.network.dto.res;

import a6.k;
import androidx.fragment.app.z;
import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto;
import eb.j;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.a0;
import yg.l;
import yg.o;
import yg.p;
import yg.s;
import zg.b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponsePlantDto_DataResponsePlantDtoJsonAdapter;", "Lyg/l;", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponsePlantDto$DataResponsePlantDto;", "", "toString", "Lyg/p;", "reader", "fromJson", "Lyg/s;", "writer", "value_", "", "toJson", "Lyg/o;", "options", "Lyg/o;", "stringAdapter", "Lyg/l;", "", "listOfStringAdapter", "", "doubleAdapter", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponsePlantDto$DataResponsePlantDto$DiseasePlantDto;", "listOfDiseasePlantDtoAdapter", "nullableDiseasePlantDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lyg/a0;", "moshi", "<init>", "(Lyg/a0;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto_DataResponsePlantDtoJsonAdapter, reason: from toString */
/* loaded from: classes4.dex */
public final class GeneratedJsonAdapter extends l {
    private volatile Constructor<ResponsePlantDto.DataResponsePlantDto> constructorRef;
    private final l doubleAdapter;
    private final l listOfDiseasePlantDtoAdapter;
    private final l listOfStringAdapter;
    private final l nullableDiseasePlantDtoAdapter;
    private final o options;
    private final l stringAdapter;

    public GeneratedJsonAdapter(a0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o a = o.a("scientificName", "genus", "family", "commonNames", "images", "matchingScore", "treatment", "commonDiseases", "diseases");
        Intrinsics.checkNotNullExpressionValue(a, "of(...)");
        this.options = a;
        this.stringAdapter = j.u(moshi, String.class, "scientificName", "adapter(...)");
        l a10 = moshi.a(k.H(String.class), SetsKt.emptySet(), "commonNames");
        Intrinsics.checkNotNullExpressionValue(a10, "adapter(...)");
        this.listOfStringAdapter = a10;
        this.doubleAdapter = j.u(moshi, Double.TYPE, "matchingScore", "adapter(...)");
        l a11 = moshi.a(k.H(ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto.class), SetsKt.emptySet(), "commonDiseases");
        Intrinsics.checkNotNullExpressionValue(a11, "adapter(...)");
        this.listOfDiseasePlantDtoAdapter = a11;
        this.nullableDiseasePlantDtoAdapter = j.u(moshi, ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto.class, "diseases", "adapter(...)");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("GeneratedJsonAdapter(ResponsePlantDto.DataResponsePlantDto)");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // yg.l
    public ResponsePlantDto.DataResponsePlantDto fromJson(p reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Double valueOf = Double.valueOf(0.0d);
        reader.g();
        int i10 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        String str4 = null;
        List list3 = null;
        ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto diseasePlantDto = null;
        while (reader.p()) {
            switch (reader.w(this.options)) {
                case -1:
                    reader.x();
                    reader.T();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        z j3 = b.j("scientificName", "scientificName", reader);
                        Intrinsics.checkNotNullExpressionValue(j3, "unexpectedNull(...)");
                        throw j3;
                    }
                    i10 &= -2;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        z j10 = b.j("genus", "genus", reader);
                        Intrinsics.checkNotNullExpressionValue(j10, "unexpectedNull(...)");
                        throw j10;
                    }
                    i10 &= -3;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        z j11 = b.j("family", "family", reader);
                        Intrinsics.checkNotNullExpressionValue(j11, "unexpectedNull(...)");
                        throw j11;
                    }
                    i10 &= -5;
                    break;
                case 3:
                    list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        z j12 = b.j("commonNames", "commonNames", reader);
                        Intrinsics.checkNotNullExpressionValue(j12, "unexpectedNull(...)");
                        throw j12;
                    }
                    i10 &= -9;
                    break;
                case 4:
                    list2 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list2 == null) {
                        z j13 = b.j("images", "images", reader);
                        Intrinsics.checkNotNullExpressionValue(j13, "unexpectedNull(...)");
                        throw j13;
                    }
                    i10 &= -17;
                    break;
                case 5:
                    valueOf = (Double) this.doubleAdapter.fromJson(reader);
                    if (valueOf == null) {
                        z j14 = b.j("matchingScore", "matchingScore", reader);
                        Intrinsics.checkNotNullExpressionValue(j14, "unexpectedNull(...)");
                        throw j14;
                    }
                    i10 &= -33;
                    break;
                case 6:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        z j15 = b.j("treatment", "treatment", reader);
                        Intrinsics.checkNotNullExpressionValue(j15, "unexpectedNull(...)");
                        throw j15;
                    }
                    i10 &= -65;
                    break;
                case 7:
                    list3 = (List) this.listOfDiseasePlantDtoAdapter.fromJson(reader);
                    if (list3 == null) {
                        z j16 = b.j("commonDiseases", "commonDiseases", reader);
                        Intrinsics.checkNotNullExpressionValue(j16, "unexpectedNull(...)");
                        throw j16;
                    }
                    i10 &= -129;
                    break;
                case 8:
                    diseasePlantDto = (ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto) this.nullableDiseasePlantDtoAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
            }
        }
        reader.k();
        if (i10 == -512) {
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(str3, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            double doubleValue = valueOf.doubleValue();
            Intrinsics.checkNotNull(str4, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(list3, "null cannot be cast to non-null type kotlin.collections.List<com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto>");
            return new ResponsePlantDto.DataResponsePlantDto(str, str2, str3, list, list2, doubleValue, str4, list3, diseasePlantDto);
        }
        Constructor<ResponsePlantDto.DataResponsePlantDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ResponsePlantDto.DataResponsePlantDto.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, List.class, Double.TYPE, String.class, List.class, ResponsePlantDto.DataResponsePlantDto.DiseasePlantDto.class, Integer.TYPE, b.f28764c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ResponsePlantDto.DataResponsePlantDto newInstance = constructor.newInstance(str, str2, str3, list, list2, valueOf, str4, list3, diseasePlantDto, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // yg.l
    public void toJson(s writer, ResponsePlantDto.DataResponsePlantDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ != null) {
            writer.g();
            writer.k("scientificName");
            this.stringAdapter.toJson(writer, value_.getScientificName());
            writer.k("genus");
            this.stringAdapter.toJson(writer, value_.getGenus());
            writer.k("family");
            this.stringAdapter.toJson(writer, value_.getFamily());
            writer.k("commonNames");
            this.listOfStringAdapter.toJson(writer, value_.getCommonNames());
            writer.k("images");
            this.listOfStringAdapter.toJson(writer, value_.getImages());
            writer.k("matchingScore");
            this.doubleAdapter.toJson(writer, Double.valueOf(value_.getMatchingScore()));
            writer.k("treatment");
            this.stringAdapter.toJson(writer, value_.getTreatment());
            writer.k("commonDiseases");
            this.listOfDiseasePlantDtoAdapter.toJson(writer, value_.getCommonDiseases());
            writer.k("diseases");
            this.nullableDiseasePlantDtoAdapter.toJson(writer, value_.getDiseases());
            writer.j();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
