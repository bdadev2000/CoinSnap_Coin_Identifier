package com.plantcare.ai.identifier.plantid.data.network.dto.res;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;
import yg.m;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto;", "", "code", "", DataSchemeDataSource.SCHEME_DATA, "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data;", PglCryptUtils.KEY_MESSAGE, MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "statusCode", "", CampaignEx.JSON_KEY_TIMESTAMP, "(Ljava/lang/String;Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data;", "getMessage", "getPath", "getStatusCode", "()I", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Data", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@m(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ResponseWeatherDto {
    private final String code;
    private final Data data;
    private final String message;
    private final String path;
    private final int statusCode;
    private final String timestamp;

    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data;", "", "alerts", "", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Alert;", "current", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Current;", "forecast", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast;", "time", "", "(Ljava/util/List;Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Current;Ljava/util/List;Ljava/lang/String;)V", "getAlerts", "()Ljava/util/List;", "getCurrent", "()Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Current;", "getForecast", "getTime", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Alert", "Current", "Forecast", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @m(generateAdapter = true)
    /* loaded from: classes4.dex */
    public static final /* data */ class Data {
        private final List<Alert> alerts;
        private final Current current;
        private final List<Forecast> forecast;
        private final String time;

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00063"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Alert;", "", "areas", "", "category", "certainty", CampaignEx.JSON_KEY_DESC, "effective", NotificationCompat.CATEGORY_EVENT, "expires", "headline", "instruction", "msgtype", "note", "severity", "urgency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAreas", "()Ljava/lang/String;", "getCategory", "getCertainty", "getDesc", "getEffective", "getEvent", "getExpires", "getHeadline", "getInstruction", "getMsgtype", "getNote", "getSeverity", "getUrgency", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @m(generateAdapter = true)
        /* loaded from: classes4.dex */
        public static final /* data */ class Alert {
            private final String areas;
            private final String category;
            private final String certainty;
            private final String desc;
            private final String effective;
            private final String event;
            private final String expires;
            private final String headline;
            private final String instruction;
            private final String msgtype;
            private final String note;
            private final String severity;
            private final String urgency;

            public Alert() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAreas() {
                return this.areas;
            }

            /* renamed from: component10, reason: from getter */
            public final String getMsgtype() {
                return this.msgtype;
            }

            /* renamed from: component11, reason: from getter */
            public final String getNote() {
                return this.note;
            }

            /* renamed from: component12, reason: from getter */
            public final String getSeverity() {
                return this.severity;
            }

            /* renamed from: component13, reason: from getter */
            public final String getUrgency() {
                return this.urgency;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCategory() {
                return this.category;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCertainty() {
                return this.certainty;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDesc() {
                return this.desc;
            }

            /* renamed from: component5, reason: from getter */
            public final String getEffective() {
                return this.effective;
            }

            /* renamed from: component6, reason: from getter */
            public final String getEvent() {
                return this.event;
            }

            /* renamed from: component7, reason: from getter */
            public final String getExpires() {
                return this.expires;
            }

            /* renamed from: component8, reason: from getter */
            public final String getHeadline() {
                return this.headline;
            }

            /* renamed from: component9, reason: from getter */
            public final String getInstruction() {
                return this.instruction;
            }

            public final Alert copy(String areas, String category, String certainty, String desc, String effective, String event, String expires, String headline, String instruction, String msgtype, String note, String severity, String urgency) {
                return new Alert(areas, category, certainty, desc, effective, event, expires, headline, instruction, msgtype, note, severity, urgency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Alert)) {
                    return false;
                }
                Alert alert = (Alert) other;
                return Intrinsics.areEqual(this.areas, alert.areas) && Intrinsics.areEqual(this.category, alert.category) && Intrinsics.areEqual(this.certainty, alert.certainty) && Intrinsics.areEqual(this.desc, alert.desc) && Intrinsics.areEqual(this.effective, alert.effective) && Intrinsics.areEqual(this.event, alert.event) && Intrinsics.areEqual(this.expires, alert.expires) && Intrinsics.areEqual(this.headline, alert.headline) && Intrinsics.areEqual(this.instruction, alert.instruction) && Intrinsics.areEqual(this.msgtype, alert.msgtype) && Intrinsics.areEqual(this.note, alert.note) && Intrinsics.areEqual(this.severity, alert.severity) && Intrinsics.areEqual(this.urgency, alert.urgency);
            }

            public final String getAreas() {
                return this.areas;
            }

            public final String getCategory() {
                return this.category;
            }

            public final String getCertainty() {
                return this.certainty;
            }

            public final String getDesc() {
                return this.desc;
            }

            public final String getEffective() {
                return this.effective;
            }

            public final String getEvent() {
                return this.event;
            }

            public final String getExpires() {
                return this.expires;
            }

            public final String getHeadline() {
                return this.headline;
            }

            public final String getInstruction() {
                return this.instruction;
            }

            public final String getMsgtype() {
                return this.msgtype;
            }

            public final String getNote() {
                return this.note;
            }

            public final String getSeverity() {
                return this.severity;
            }

            public final String getUrgency() {
                return this.urgency;
            }

            public int hashCode() {
                String str = this.areas;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.category;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.certainty;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.desc;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.effective;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.event;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.expires;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.headline;
                int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.instruction;
                int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.msgtype;
                int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.note;
                int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.severity;
                int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.urgency;
                return hashCode12 + (str13 != null ? str13.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Alert(areas=");
                sb2.append(this.areas);
                sb2.append(", category=");
                sb2.append(this.category);
                sb2.append(", certainty=");
                sb2.append(this.certainty);
                sb2.append(", desc=");
                sb2.append(this.desc);
                sb2.append(", effective=");
                sb2.append(this.effective);
                sb2.append(", event=");
                sb2.append(this.event);
                sb2.append(", expires=");
                sb2.append(this.expires);
                sb2.append(", headline=");
                sb2.append(this.headline);
                sb2.append(", instruction=");
                sb2.append(this.instruction);
                sb2.append(", msgtype=");
                sb2.append(this.msgtype);
                sb2.append(", note=");
                sb2.append(this.note);
                sb2.append(", severity=");
                sb2.append(this.severity);
                sb2.append(", urgency=");
                return e.g(sb2, this.urgency, ')');
            }

            public Alert(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
                this.areas = str;
                this.category = str2;
                this.certainty = str3;
                this.desc = str4;
                this.effective = str5;
                this.event = str6;
                this.expires = str7;
                this.headline = str8;
                this.instruction = str9;
                this.msgtype = str10;
                this.note = str11;
                this.severity = str12;
                this.urgency = str13;
            }

            public /* synthetic */ Alert(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : str11, (i10 & 2048) != 0 ? null : str12, (i10 & 4096) == 0 ? str13 : null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJò\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u000eHÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b#\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\r\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b'\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u001aR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b*\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b+\u0010\u001aR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b,\u0010\u001aR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b-\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b/\u0010\u001a¨\u0006J"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Current;", "", "airQualityIndex", "", "airQualityText", "", "cloud", "conditionCode", "dewpointC", "dewpointF", "feelslikeC", "feelslikeF", "humidity", "isDay", "", "precipMm", "pressureHPa", "tempC", "tempF", "uv", "visKm", "windDegree", "windDir", "windMps", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V", "getAirQualityIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAirQualityText", "()Ljava/lang/String;", "getCloud", "getConditionCode", "getDewpointC", "getDewpointF", "getFeelslikeC", "getFeelslikeF", "getHumidity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrecipMm", "getPressureHPa", "getTempC", "getTempF", "getUv", "getVisKm", "getWindDegree", "getWindDir", "getWindMps", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Current;", "equals", "", "other", "hashCode", "toString", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @m(generateAdapter = true)
        /* loaded from: classes4.dex */
        public static final /* data */ class Current {
            private final Double airQualityIndex;
            private final String airQualityText;
            private final Double cloud;
            private final Double conditionCode;
            private final Double dewpointC;
            private final Double dewpointF;
            private final Double feelslikeC;
            private final Double feelslikeF;
            private final Double humidity;
            private final Integer isDay;
            private final Double precipMm;
            private final Double pressureHPa;
            private final Double tempC;
            private final Double tempF;
            private final Double uv;
            private final Double visKm;
            private final Double windDegree;
            private final String windDir;
            private final Double windMps;

            public Current() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
            }

            /* renamed from: component1, reason: from getter */
            public final Double getAirQualityIndex() {
                return this.airQualityIndex;
            }

            /* renamed from: component10, reason: from getter */
            public final Integer getIsDay() {
                return this.isDay;
            }

            /* renamed from: component11, reason: from getter */
            public final Double getPrecipMm() {
                return this.precipMm;
            }

            /* renamed from: component12, reason: from getter */
            public final Double getPressureHPa() {
                return this.pressureHPa;
            }

            /* renamed from: component13, reason: from getter */
            public final Double getTempC() {
                return this.tempC;
            }

            /* renamed from: component14, reason: from getter */
            public final Double getTempF() {
                return this.tempF;
            }

            /* renamed from: component15, reason: from getter */
            public final Double getUv() {
                return this.uv;
            }

            /* renamed from: component16, reason: from getter */
            public final Double getVisKm() {
                return this.visKm;
            }

            /* renamed from: component17, reason: from getter */
            public final Double getWindDegree() {
                return this.windDegree;
            }

            /* renamed from: component18, reason: from getter */
            public final String getWindDir() {
                return this.windDir;
            }

            /* renamed from: component19, reason: from getter */
            public final Double getWindMps() {
                return this.windMps;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAirQualityText() {
                return this.airQualityText;
            }

            /* renamed from: component3, reason: from getter */
            public final Double getCloud() {
                return this.cloud;
            }

            /* renamed from: component4, reason: from getter */
            public final Double getConditionCode() {
                return this.conditionCode;
            }

            /* renamed from: component5, reason: from getter */
            public final Double getDewpointC() {
                return this.dewpointC;
            }

            /* renamed from: component6, reason: from getter */
            public final Double getDewpointF() {
                return this.dewpointF;
            }

            /* renamed from: component7, reason: from getter */
            public final Double getFeelslikeC() {
                return this.feelslikeC;
            }

            /* renamed from: component8, reason: from getter */
            public final Double getFeelslikeF() {
                return this.feelslikeF;
            }

            /* renamed from: component9, reason: from getter */
            public final Double getHumidity() {
                return this.humidity;
            }

            public final Current copy(Double airQualityIndex, String airQualityText, Double cloud, Double conditionCode, Double dewpointC, Double dewpointF, Double feelslikeC, Double feelslikeF, Double humidity, Integer isDay, Double precipMm, Double pressureHPa, Double tempC, Double tempF, Double uv, Double visKm, Double windDegree, String windDir, Double windMps) {
                return new Current(airQualityIndex, airQualityText, cloud, conditionCode, dewpointC, dewpointF, feelslikeC, feelslikeF, humidity, isDay, precipMm, pressureHPa, tempC, tempF, uv, visKm, windDegree, windDir, windMps);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Current)) {
                    return false;
                }
                Current current = (Current) other;
                return Intrinsics.areEqual((Object) this.airQualityIndex, (Object) current.airQualityIndex) && Intrinsics.areEqual(this.airQualityText, current.airQualityText) && Intrinsics.areEqual((Object) this.cloud, (Object) current.cloud) && Intrinsics.areEqual((Object) this.conditionCode, (Object) current.conditionCode) && Intrinsics.areEqual((Object) this.dewpointC, (Object) current.dewpointC) && Intrinsics.areEqual((Object) this.dewpointF, (Object) current.dewpointF) && Intrinsics.areEqual((Object) this.feelslikeC, (Object) current.feelslikeC) && Intrinsics.areEqual((Object) this.feelslikeF, (Object) current.feelslikeF) && Intrinsics.areEqual((Object) this.humidity, (Object) current.humidity) && Intrinsics.areEqual(this.isDay, current.isDay) && Intrinsics.areEqual((Object) this.precipMm, (Object) current.precipMm) && Intrinsics.areEqual((Object) this.pressureHPa, (Object) current.pressureHPa) && Intrinsics.areEqual((Object) this.tempC, (Object) current.tempC) && Intrinsics.areEqual((Object) this.tempF, (Object) current.tempF) && Intrinsics.areEqual((Object) this.uv, (Object) current.uv) && Intrinsics.areEqual((Object) this.visKm, (Object) current.visKm) && Intrinsics.areEqual((Object) this.windDegree, (Object) current.windDegree) && Intrinsics.areEqual(this.windDir, current.windDir) && Intrinsics.areEqual((Object) this.windMps, (Object) current.windMps);
            }

            public final Double getAirQualityIndex() {
                return this.airQualityIndex;
            }

            public final String getAirQualityText() {
                return this.airQualityText;
            }

            public final Double getCloud() {
                return this.cloud;
            }

            public final Double getConditionCode() {
                return this.conditionCode;
            }

            public final Double getDewpointC() {
                return this.dewpointC;
            }

            public final Double getDewpointF() {
                return this.dewpointF;
            }

            public final Double getFeelslikeC() {
                return this.feelslikeC;
            }

            public final Double getFeelslikeF() {
                return this.feelslikeF;
            }

            public final Double getHumidity() {
                return this.humidity;
            }

            public final Double getPrecipMm() {
                return this.precipMm;
            }

            public final Double getPressureHPa() {
                return this.pressureHPa;
            }

            public final Double getTempC() {
                return this.tempC;
            }

            public final Double getTempF() {
                return this.tempF;
            }

            public final Double getUv() {
                return this.uv;
            }

            public final Double getVisKm() {
                return this.visKm;
            }

            public final Double getWindDegree() {
                return this.windDegree;
            }

            public final String getWindDir() {
                return this.windDir;
            }

            public final Double getWindMps() {
                return this.windMps;
            }

            public int hashCode() {
                Double d10 = this.airQualityIndex;
                int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                String str = this.airQualityText;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Double d11 = this.cloud;
                int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
                Double d12 = this.conditionCode;
                int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
                Double d13 = this.dewpointC;
                int hashCode5 = (hashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
                Double d14 = this.dewpointF;
                int hashCode6 = (hashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
                Double d15 = this.feelslikeC;
                int hashCode7 = (hashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
                Double d16 = this.feelslikeF;
                int hashCode8 = (hashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
                Double d17 = this.humidity;
                int hashCode9 = (hashCode8 + (d17 == null ? 0 : d17.hashCode())) * 31;
                Integer num = this.isDay;
                int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
                Double d18 = this.precipMm;
                int hashCode11 = (hashCode10 + (d18 == null ? 0 : d18.hashCode())) * 31;
                Double d19 = this.pressureHPa;
                int hashCode12 = (hashCode11 + (d19 == null ? 0 : d19.hashCode())) * 31;
                Double d20 = this.tempC;
                int hashCode13 = (hashCode12 + (d20 == null ? 0 : d20.hashCode())) * 31;
                Double d21 = this.tempF;
                int hashCode14 = (hashCode13 + (d21 == null ? 0 : d21.hashCode())) * 31;
                Double d22 = this.uv;
                int hashCode15 = (hashCode14 + (d22 == null ? 0 : d22.hashCode())) * 31;
                Double d23 = this.visKm;
                int hashCode16 = (hashCode15 + (d23 == null ? 0 : d23.hashCode())) * 31;
                Double d24 = this.windDegree;
                int hashCode17 = (hashCode16 + (d24 == null ? 0 : d24.hashCode())) * 31;
                String str2 = this.windDir;
                int hashCode18 = (hashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Double d25 = this.windMps;
                return hashCode18 + (d25 != null ? d25.hashCode() : 0);
            }

            public final Integer isDay() {
                return this.isDay;
            }

            public String toString() {
                return "Current(airQualityIndex=" + this.airQualityIndex + ", airQualityText=" + this.airQualityText + ", cloud=" + this.cloud + ", conditionCode=" + this.conditionCode + ", dewpointC=" + this.dewpointC + ", dewpointF=" + this.dewpointF + ", feelslikeC=" + this.feelslikeC + ", feelslikeF=" + this.feelslikeF + ", humidity=" + this.humidity + ", isDay=" + this.isDay + ", precipMm=" + this.precipMm + ", pressureHPa=" + this.pressureHPa + ", tempC=" + this.tempC + ", tempF=" + this.tempF + ", uv=" + this.uv + ", visKm=" + this.visKm + ", windDegree=" + this.windDegree + ", windDir=" + this.windDir + ", windMps=" + this.windMps + ')';
            }

            public Current(Double d10, String str, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Integer num, Double d18, Double d19, Double d20, Double d21, Double d22, Double d23, Double d24, String str2, Double d25) {
                this.airQualityIndex = d10;
                this.airQualityText = str;
                this.cloud = d11;
                this.conditionCode = d12;
                this.dewpointC = d13;
                this.dewpointF = d14;
                this.feelslikeC = d15;
                this.feelslikeF = d16;
                this.humidity = d17;
                this.isDay = num;
                this.precipMm = d18;
                this.pressureHPa = d19;
                this.tempC = d20;
                this.tempF = d21;
                this.uv = d22;
                this.visKm = d23;
                this.windDegree = d24;
                this.windDir = str2;
                this.windMps = d25;
            }

            public /* synthetic */ Current(Double d10, String str, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Integer num, Double d18, Double d19, Double d20, Double d21, Double d22, Double d23, Double d24, String str2, Double d25, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? null : d12, (i10 & 16) != 0 ? null : d13, (i10 & 32) != 0 ? null : d14, (i10 & 64) != 0 ? null : d15, (i10 & 128) != 0 ? null : d16, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : d17, (i10 & 512) != 0 ? null : num, (i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : d18, (i10 & 2048) != 0 ? null : d19, (i10 & 4096) != 0 ? null : d20, (i10 & 8192) != 0 ? null : d21, (i10 & JsonLexerKt.BATCH_SIZE) != 0 ? null : d22, (i10 & 32768) != 0 ? null : d23, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : d24, (i10 & 131072) != 0 ? null : str2, (i10 & 262144) != 0 ? null : d25);
            }
        }

        @Keep
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast;", "", "date", "", "dateEpoch", "", "day", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Day;", "hour", "", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Hour;", "(Ljava/lang/String;Ljava/lang/Double;Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Day;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "getDateEpoch", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDay", "()Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Day;", "getHour", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Day;Ljava/util/List;)Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast;", "equals", "", "other", "hashCode", "", "toString", "Day", "Hour", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @m(generateAdapter = true)
        /* loaded from: classes4.dex */
        public static final /* data */ class Forecast {
            private final String date;
            private final Double dateEpoch;
            private final Day day;
            private final List<Hour> hour;

            @Keep
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u008a\u0002\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\"\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b$\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b%\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b&\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b)\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u001bR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b+\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u001bR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b0\u0010\u001bR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b1\u0010\u001b¨\u0006O"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Day;", "", "airQualityIndex", "", "airQualityText", "", "avghumidity", "avgtempC", "avgtempF", "avgvisKm", "conditionCode", "dailyChanceOfRain", "dailyChanceOfSnow", "dailyWillItRain", "dailyWillItSnow", "maxtempC", "maxtempF", "maxwindMps", "mintempC", "mintempF", "sunrise", "sunset", "totalprecipMm", "totalsnowCm", "uv", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAirQualityIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAirQualityText", "()Ljava/lang/String;", "getAvghumidity", "getAvgtempC", "getAvgtempF", "getAvgvisKm", "getConditionCode", "getDailyChanceOfRain", "getDailyChanceOfSnow", "getDailyWillItRain", "getDailyWillItSnow", "getMaxtempC", "getMaxtempF", "getMaxwindMps", "getMintempC", "getMintempF", "getSunrise", "getSunset", "getTotalprecipMm", "getTotalsnowCm", "getUv", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Day;", "equals", "", "other", "hashCode", "", "toString", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @m(generateAdapter = true)
            /* loaded from: classes4.dex */
            public static final /* data */ class Day {
                private final Double airQualityIndex;
                private final String airQualityText;
                private final Double avghumidity;
                private final Double avgtempC;
                private final Double avgtempF;
                private final Double avgvisKm;
                private final Double conditionCode;
                private final Double dailyChanceOfRain;
                private final Double dailyChanceOfSnow;
                private final Double dailyWillItRain;
                private final Double dailyWillItSnow;
                private final Double maxtempC;
                private final Double maxtempF;
                private final Double maxwindMps;
                private final Double mintempC;
                private final Double mintempF;
                private final String sunrise;
                private final String sunset;
                private final Double totalprecipMm;
                private final Double totalsnowCm;
                private final Double uv;

                public Day() {
                    this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
                }

                /* renamed from: component1, reason: from getter */
                public final Double getAirQualityIndex() {
                    return this.airQualityIndex;
                }

                /* renamed from: component10, reason: from getter */
                public final Double getDailyWillItRain() {
                    return this.dailyWillItRain;
                }

                /* renamed from: component11, reason: from getter */
                public final Double getDailyWillItSnow() {
                    return this.dailyWillItSnow;
                }

                /* renamed from: component12, reason: from getter */
                public final Double getMaxtempC() {
                    return this.maxtempC;
                }

                /* renamed from: component13, reason: from getter */
                public final Double getMaxtempF() {
                    return this.maxtempF;
                }

                /* renamed from: component14, reason: from getter */
                public final Double getMaxwindMps() {
                    return this.maxwindMps;
                }

                /* renamed from: component15, reason: from getter */
                public final Double getMintempC() {
                    return this.mintempC;
                }

                /* renamed from: component16, reason: from getter */
                public final Double getMintempF() {
                    return this.mintempF;
                }

                /* renamed from: component17, reason: from getter */
                public final String getSunrise() {
                    return this.sunrise;
                }

                /* renamed from: component18, reason: from getter */
                public final String getSunset() {
                    return this.sunset;
                }

                /* renamed from: component19, reason: from getter */
                public final Double getTotalprecipMm() {
                    return this.totalprecipMm;
                }

                /* renamed from: component2, reason: from getter */
                public final String getAirQualityText() {
                    return this.airQualityText;
                }

                /* renamed from: component20, reason: from getter */
                public final Double getTotalsnowCm() {
                    return this.totalsnowCm;
                }

                /* renamed from: component21, reason: from getter */
                public final Double getUv() {
                    return this.uv;
                }

                /* renamed from: component3, reason: from getter */
                public final Double getAvghumidity() {
                    return this.avghumidity;
                }

                /* renamed from: component4, reason: from getter */
                public final Double getAvgtempC() {
                    return this.avgtempC;
                }

                /* renamed from: component5, reason: from getter */
                public final Double getAvgtempF() {
                    return this.avgtempF;
                }

                /* renamed from: component6, reason: from getter */
                public final Double getAvgvisKm() {
                    return this.avgvisKm;
                }

                /* renamed from: component7, reason: from getter */
                public final Double getConditionCode() {
                    return this.conditionCode;
                }

                /* renamed from: component8, reason: from getter */
                public final Double getDailyChanceOfRain() {
                    return this.dailyChanceOfRain;
                }

                /* renamed from: component9, reason: from getter */
                public final Double getDailyChanceOfSnow() {
                    return this.dailyChanceOfSnow;
                }

                public final Day copy(Double airQualityIndex, String airQualityText, Double avghumidity, Double avgtempC, Double avgtempF, Double avgvisKm, Double conditionCode, Double dailyChanceOfRain, Double dailyChanceOfSnow, Double dailyWillItRain, Double dailyWillItSnow, Double maxtempC, Double maxtempF, Double maxwindMps, Double mintempC, Double mintempF, String sunrise, String sunset, Double totalprecipMm, Double totalsnowCm, Double uv) {
                    return new Day(airQualityIndex, airQualityText, avghumidity, avgtempC, avgtempF, avgvisKm, conditionCode, dailyChanceOfRain, dailyChanceOfSnow, dailyWillItRain, dailyWillItSnow, maxtempC, maxtempF, maxwindMps, mintempC, mintempF, sunrise, sunset, totalprecipMm, totalsnowCm, uv);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Day)) {
                        return false;
                    }
                    Day day = (Day) other;
                    return Intrinsics.areEqual((Object) this.airQualityIndex, (Object) day.airQualityIndex) && Intrinsics.areEqual(this.airQualityText, day.airQualityText) && Intrinsics.areEqual((Object) this.avghumidity, (Object) day.avghumidity) && Intrinsics.areEqual((Object) this.avgtempC, (Object) day.avgtempC) && Intrinsics.areEqual((Object) this.avgtempF, (Object) day.avgtempF) && Intrinsics.areEqual((Object) this.avgvisKm, (Object) day.avgvisKm) && Intrinsics.areEqual((Object) this.conditionCode, (Object) day.conditionCode) && Intrinsics.areEqual((Object) this.dailyChanceOfRain, (Object) day.dailyChanceOfRain) && Intrinsics.areEqual((Object) this.dailyChanceOfSnow, (Object) day.dailyChanceOfSnow) && Intrinsics.areEqual((Object) this.dailyWillItRain, (Object) day.dailyWillItRain) && Intrinsics.areEqual((Object) this.dailyWillItSnow, (Object) day.dailyWillItSnow) && Intrinsics.areEqual((Object) this.maxtempC, (Object) day.maxtempC) && Intrinsics.areEqual((Object) this.maxtempF, (Object) day.maxtempF) && Intrinsics.areEqual((Object) this.maxwindMps, (Object) day.maxwindMps) && Intrinsics.areEqual((Object) this.mintempC, (Object) day.mintempC) && Intrinsics.areEqual((Object) this.mintempF, (Object) day.mintempF) && Intrinsics.areEqual(this.sunrise, day.sunrise) && Intrinsics.areEqual(this.sunset, day.sunset) && Intrinsics.areEqual((Object) this.totalprecipMm, (Object) day.totalprecipMm) && Intrinsics.areEqual((Object) this.totalsnowCm, (Object) day.totalsnowCm) && Intrinsics.areEqual((Object) this.uv, (Object) day.uv);
                }

                public final Double getAirQualityIndex() {
                    return this.airQualityIndex;
                }

                public final String getAirQualityText() {
                    return this.airQualityText;
                }

                public final Double getAvghumidity() {
                    return this.avghumidity;
                }

                public final Double getAvgtempC() {
                    return this.avgtempC;
                }

                public final Double getAvgtempF() {
                    return this.avgtempF;
                }

                public final Double getAvgvisKm() {
                    return this.avgvisKm;
                }

                public final Double getConditionCode() {
                    return this.conditionCode;
                }

                public final Double getDailyChanceOfRain() {
                    return this.dailyChanceOfRain;
                }

                public final Double getDailyChanceOfSnow() {
                    return this.dailyChanceOfSnow;
                }

                public final Double getDailyWillItRain() {
                    return this.dailyWillItRain;
                }

                public final Double getDailyWillItSnow() {
                    return this.dailyWillItSnow;
                }

                public final Double getMaxtempC() {
                    return this.maxtempC;
                }

                public final Double getMaxtempF() {
                    return this.maxtempF;
                }

                public final Double getMaxwindMps() {
                    return this.maxwindMps;
                }

                public final Double getMintempC() {
                    return this.mintempC;
                }

                public final Double getMintempF() {
                    return this.mintempF;
                }

                public final String getSunrise() {
                    return this.sunrise;
                }

                public final String getSunset() {
                    return this.sunset;
                }

                public final Double getTotalprecipMm() {
                    return this.totalprecipMm;
                }

                public final Double getTotalsnowCm() {
                    return this.totalsnowCm;
                }

                public final Double getUv() {
                    return this.uv;
                }

                public int hashCode() {
                    Double d10 = this.airQualityIndex;
                    int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                    String str = this.airQualityText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Double d11 = this.avghumidity;
                    int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
                    Double d12 = this.avgtempC;
                    int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
                    Double d13 = this.avgtempF;
                    int hashCode5 = (hashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
                    Double d14 = this.avgvisKm;
                    int hashCode6 = (hashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
                    Double d15 = this.conditionCode;
                    int hashCode7 = (hashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
                    Double d16 = this.dailyChanceOfRain;
                    int hashCode8 = (hashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
                    Double d17 = this.dailyChanceOfSnow;
                    int hashCode9 = (hashCode8 + (d17 == null ? 0 : d17.hashCode())) * 31;
                    Double d18 = this.dailyWillItRain;
                    int hashCode10 = (hashCode9 + (d18 == null ? 0 : d18.hashCode())) * 31;
                    Double d19 = this.dailyWillItSnow;
                    int hashCode11 = (hashCode10 + (d19 == null ? 0 : d19.hashCode())) * 31;
                    Double d20 = this.maxtempC;
                    int hashCode12 = (hashCode11 + (d20 == null ? 0 : d20.hashCode())) * 31;
                    Double d21 = this.maxtempF;
                    int hashCode13 = (hashCode12 + (d21 == null ? 0 : d21.hashCode())) * 31;
                    Double d22 = this.maxwindMps;
                    int hashCode14 = (hashCode13 + (d22 == null ? 0 : d22.hashCode())) * 31;
                    Double d23 = this.mintempC;
                    int hashCode15 = (hashCode14 + (d23 == null ? 0 : d23.hashCode())) * 31;
                    Double d24 = this.mintempF;
                    int hashCode16 = (hashCode15 + (d24 == null ? 0 : d24.hashCode())) * 31;
                    String str2 = this.sunrise;
                    int hashCode17 = (hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.sunset;
                    int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Double d25 = this.totalprecipMm;
                    int hashCode19 = (hashCode18 + (d25 == null ? 0 : d25.hashCode())) * 31;
                    Double d26 = this.totalsnowCm;
                    int hashCode20 = (hashCode19 + (d26 == null ? 0 : d26.hashCode())) * 31;
                    Double d27 = this.uv;
                    return hashCode20 + (d27 != null ? d27.hashCode() : 0);
                }

                public String toString() {
                    return "Day(airQualityIndex=" + this.airQualityIndex + ", airQualityText=" + this.airQualityText + ", avghumidity=" + this.avghumidity + ", avgtempC=" + this.avgtempC + ", avgtempF=" + this.avgtempF + ", avgvisKm=" + this.avgvisKm + ", conditionCode=" + this.conditionCode + ", dailyChanceOfRain=" + this.dailyChanceOfRain + ", dailyChanceOfSnow=" + this.dailyChanceOfSnow + ", dailyWillItRain=" + this.dailyWillItRain + ", dailyWillItSnow=" + this.dailyWillItSnow + ", maxtempC=" + this.maxtempC + ", maxtempF=" + this.maxtempF + ", maxwindMps=" + this.maxwindMps + ", mintempC=" + this.mintempC + ", mintempF=" + this.mintempF + ", sunrise=" + this.sunrise + ", sunset=" + this.sunset + ", totalprecipMm=" + this.totalprecipMm + ", totalsnowCm=" + this.totalsnowCm + ", uv=" + this.uv + ')';
                }

                public Day(Double d10, String str, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, Double d21, Double d22, Double d23, Double d24, String str2, String str3, Double d25, Double d26, Double d27) {
                    this.airQualityIndex = d10;
                    this.airQualityText = str;
                    this.avghumidity = d11;
                    this.avgtempC = d12;
                    this.avgtempF = d13;
                    this.avgvisKm = d14;
                    this.conditionCode = d15;
                    this.dailyChanceOfRain = d16;
                    this.dailyChanceOfSnow = d17;
                    this.dailyWillItRain = d18;
                    this.dailyWillItSnow = d19;
                    this.maxtempC = d20;
                    this.maxtempF = d21;
                    this.maxwindMps = d22;
                    this.mintempC = d23;
                    this.mintempF = d24;
                    this.sunrise = str2;
                    this.sunset = str3;
                    this.totalprecipMm = d25;
                    this.totalsnowCm = d26;
                    this.uv = d27;
                }

                public /* synthetic */ Day(Double d10, String str, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, Double d21, Double d22, Double d23, Double d24, String str2, String str3, Double d25, Double d26, Double d27, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? null : d12, (i10 & 16) != 0 ? null : d13, (i10 & 32) != 0 ? null : d14, (i10 & 64) != 0 ? null : d15, (i10 & 128) != 0 ? null : d16, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : d17, (i10 & 512) != 0 ? null : d18, (i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : d19, (i10 & 2048) != 0 ? null : d20, (i10 & 4096) != 0 ? null : d21, (i10 & 8192) != 0 ? null : d22, (i10 & JsonLexerKt.BATCH_SIZE) != 0 ? null : d23, (i10 & 32768) != 0 ? null : d24, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str2, (i10 & 131072) != 0 ? null : str3, (i10 & 262144) != 0 ? null : d25, (i10 & 524288) != 0 ? null : d26, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d27);
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\bI\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ¢\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b#\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b$\u0010\u001dR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b&\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b'\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\r\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b(\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b)\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b*\u0010\u001dR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b-\u0010\u001dR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001dR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b/\u0010\u001dR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b0\u0010\u001dR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b1\u0010\u001dR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b4\u0010\u001d¨\u0006T"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Hour;", "", "airQualityIndex", "", "airQualityText", "", "chanceOfRain", "chanceOfSnow", "cloud", "conditionCode", "dewpointC", "dewpointF", "humidity", "isDay", "pressureHPa", "snowCm", "tempC", "tempF", "time", "timeEpoch", "uv", "visKm", "willItRain", "willItSnow", "windDegree", "windDir", "windMps", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V", "getAirQualityIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAirQualityText", "()Ljava/lang/String;", "getChanceOfRain", "getChanceOfSnow", "getCloud", "getConditionCode", "getDewpointC", "getDewpointF", "getHumidity", "getPressureHPa", "getSnowCm", "getTempC", "getTempF", "getTime", "getTimeEpoch", "getUv", "getVisKm", "getWillItRain", "getWillItSnow", "getWindDegree", "getWindDir", "getWindMps", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto$Data$Forecast$Hour;", "equals", "", "other", "hashCode", "", "toString", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @m(generateAdapter = true)
            /* loaded from: classes4.dex */
            public static final /* data */ class Hour {
                private final Double airQualityIndex;
                private final String airQualityText;
                private final Double chanceOfRain;
                private final Double chanceOfSnow;
                private final Double cloud;
                private final Double conditionCode;
                private final Double dewpointC;
                private final Double dewpointF;
                private final Double humidity;
                private final Double isDay;
                private final Double pressureHPa;
                private final Double snowCm;
                private final Double tempC;
                private final Double tempF;
                private final String time;
                private final Double timeEpoch;
                private final Double uv;
                private final Double visKm;
                private final Double willItRain;
                private final Double willItSnow;
                private final Double windDegree;
                private final String windDir;
                private final Double windMps;

                public Hour() {
                    this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
                }

                /* renamed from: component1, reason: from getter */
                public final Double getAirQualityIndex() {
                    return this.airQualityIndex;
                }

                /* renamed from: component10, reason: from getter */
                public final Double getIsDay() {
                    return this.isDay;
                }

                /* renamed from: component11, reason: from getter */
                public final Double getPressureHPa() {
                    return this.pressureHPa;
                }

                /* renamed from: component12, reason: from getter */
                public final Double getSnowCm() {
                    return this.snowCm;
                }

                /* renamed from: component13, reason: from getter */
                public final Double getTempC() {
                    return this.tempC;
                }

                /* renamed from: component14, reason: from getter */
                public final Double getTempF() {
                    return this.tempF;
                }

                /* renamed from: component15, reason: from getter */
                public final String getTime() {
                    return this.time;
                }

                /* renamed from: component16, reason: from getter */
                public final Double getTimeEpoch() {
                    return this.timeEpoch;
                }

                /* renamed from: component17, reason: from getter */
                public final Double getUv() {
                    return this.uv;
                }

                /* renamed from: component18, reason: from getter */
                public final Double getVisKm() {
                    return this.visKm;
                }

                /* renamed from: component19, reason: from getter */
                public final Double getWillItRain() {
                    return this.willItRain;
                }

                /* renamed from: component2, reason: from getter */
                public final String getAirQualityText() {
                    return this.airQualityText;
                }

                /* renamed from: component20, reason: from getter */
                public final Double getWillItSnow() {
                    return this.willItSnow;
                }

                /* renamed from: component21, reason: from getter */
                public final Double getWindDegree() {
                    return this.windDegree;
                }

                /* renamed from: component22, reason: from getter */
                public final String getWindDir() {
                    return this.windDir;
                }

                /* renamed from: component23, reason: from getter */
                public final Double getWindMps() {
                    return this.windMps;
                }

                /* renamed from: component3, reason: from getter */
                public final Double getChanceOfRain() {
                    return this.chanceOfRain;
                }

                /* renamed from: component4, reason: from getter */
                public final Double getChanceOfSnow() {
                    return this.chanceOfSnow;
                }

                /* renamed from: component5, reason: from getter */
                public final Double getCloud() {
                    return this.cloud;
                }

                /* renamed from: component6, reason: from getter */
                public final Double getConditionCode() {
                    return this.conditionCode;
                }

                /* renamed from: component7, reason: from getter */
                public final Double getDewpointC() {
                    return this.dewpointC;
                }

                /* renamed from: component8, reason: from getter */
                public final Double getDewpointF() {
                    return this.dewpointF;
                }

                /* renamed from: component9, reason: from getter */
                public final Double getHumidity() {
                    return this.humidity;
                }

                public final Hour copy(Double airQualityIndex, String airQualityText, Double chanceOfRain, Double chanceOfSnow, Double cloud, Double conditionCode, Double dewpointC, Double dewpointF, Double humidity, Double isDay, Double pressureHPa, Double snowCm, Double tempC, Double tempF, String time, Double timeEpoch, Double uv, Double visKm, Double willItRain, Double willItSnow, Double windDegree, String windDir, Double windMps) {
                    return new Hour(airQualityIndex, airQualityText, chanceOfRain, chanceOfSnow, cloud, conditionCode, dewpointC, dewpointF, humidity, isDay, pressureHPa, snowCm, tempC, tempF, time, timeEpoch, uv, visKm, willItRain, willItSnow, windDegree, windDir, windMps);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Hour)) {
                        return false;
                    }
                    Hour hour = (Hour) other;
                    return Intrinsics.areEqual((Object) this.airQualityIndex, (Object) hour.airQualityIndex) && Intrinsics.areEqual(this.airQualityText, hour.airQualityText) && Intrinsics.areEqual((Object) this.chanceOfRain, (Object) hour.chanceOfRain) && Intrinsics.areEqual((Object) this.chanceOfSnow, (Object) hour.chanceOfSnow) && Intrinsics.areEqual((Object) this.cloud, (Object) hour.cloud) && Intrinsics.areEqual((Object) this.conditionCode, (Object) hour.conditionCode) && Intrinsics.areEqual((Object) this.dewpointC, (Object) hour.dewpointC) && Intrinsics.areEqual((Object) this.dewpointF, (Object) hour.dewpointF) && Intrinsics.areEqual((Object) this.humidity, (Object) hour.humidity) && Intrinsics.areEqual((Object) this.isDay, (Object) hour.isDay) && Intrinsics.areEqual((Object) this.pressureHPa, (Object) hour.pressureHPa) && Intrinsics.areEqual((Object) this.snowCm, (Object) hour.snowCm) && Intrinsics.areEqual((Object) this.tempC, (Object) hour.tempC) && Intrinsics.areEqual((Object) this.tempF, (Object) hour.tempF) && Intrinsics.areEqual(this.time, hour.time) && Intrinsics.areEqual((Object) this.timeEpoch, (Object) hour.timeEpoch) && Intrinsics.areEqual((Object) this.uv, (Object) hour.uv) && Intrinsics.areEqual((Object) this.visKm, (Object) hour.visKm) && Intrinsics.areEqual((Object) this.willItRain, (Object) hour.willItRain) && Intrinsics.areEqual((Object) this.willItSnow, (Object) hour.willItSnow) && Intrinsics.areEqual((Object) this.windDegree, (Object) hour.windDegree) && Intrinsics.areEqual(this.windDir, hour.windDir) && Intrinsics.areEqual((Object) this.windMps, (Object) hour.windMps);
                }

                public final Double getAirQualityIndex() {
                    return this.airQualityIndex;
                }

                public final String getAirQualityText() {
                    return this.airQualityText;
                }

                public final Double getChanceOfRain() {
                    return this.chanceOfRain;
                }

                public final Double getChanceOfSnow() {
                    return this.chanceOfSnow;
                }

                public final Double getCloud() {
                    return this.cloud;
                }

                public final Double getConditionCode() {
                    return this.conditionCode;
                }

                public final Double getDewpointC() {
                    return this.dewpointC;
                }

                public final Double getDewpointF() {
                    return this.dewpointF;
                }

                public final Double getHumidity() {
                    return this.humidity;
                }

                public final Double getPressureHPa() {
                    return this.pressureHPa;
                }

                public final Double getSnowCm() {
                    return this.snowCm;
                }

                public final Double getTempC() {
                    return this.tempC;
                }

                public final Double getTempF() {
                    return this.tempF;
                }

                public final String getTime() {
                    return this.time;
                }

                public final Double getTimeEpoch() {
                    return this.timeEpoch;
                }

                public final Double getUv() {
                    return this.uv;
                }

                public final Double getVisKm() {
                    return this.visKm;
                }

                public final Double getWillItRain() {
                    return this.willItRain;
                }

                public final Double getWillItSnow() {
                    return this.willItSnow;
                }

                public final Double getWindDegree() {
                    return this.windDegree;
                }

                public final String getWindDir() {
                    return this.windDir;
                }

                public final Double getWindMps() {
                    return this.windMps;
                }

                public int hashCode() {
                    Double d10 = this.airQualityIndex;
                    int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                    String str = this.airQualityText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Double d11 = this.chanceOfRain;
                    int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
                    Double d12 = this.chanceOfSnow;
                    int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
                    Double d13 = this.cloud;
                    int hashCode5 = (hashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
                    Double d14 = this.conditionCode;
                    int hashCode6 = (hashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
                    Double d15 = this.dewpointC;
                    int hashCode7 = (hashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
                    Double d16 = this.dewpointF;
                    int hashCode8 = (hashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
                    Double d17 = this.humidity;
                    int hashCode9 = (hashCode8 + (d17 == null ? 0 : d17.hashCode())) * 31;
                    Double d18 = this.isDay;
                    int hashCode10 = (hashCode9 + (d18 == null ? 0 : d18.hashCode())) * 31;
                    Double d19 = this.pressureHPa;
                    int hashCode11 = (hashCode10 + (d19 == null ? 0 : d19.hashCode())) * 31;
                    Double d20 = this.snowCm;
                    int hashCode12 = (hashCode11 + (d20 == null ? 0 : d20.hashCode())) * 31;
                    Double d21 = this.tempC;
                    int hashCode13 = (hashCode12 + (d21 == null ? 0 : d21.hashCode())) * 31;
                    Double d22 = this.tempF;
                    int hashCode14 = (hashCode13 + (d22 == null ? 0 : d22.hashCode())) * 31;
                    String str2 = this.time;
                    int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Double d23 = this.timeEpoch;
                    int hashCode16 = (hashCode15 + (d23 == null ? 0 : d23.hashCode())) * 31;
                    Double d24 = this.uv;
                    int hashCode17 = (hashCode16 + (d24 == null ? 0 : d24.hashCode())) * 31;
                    Double d25 = this.visKm;
                    int hashCode18 = (hashCode17 + (d25 == null ? 0 : d25.hashCode())) * 31;
                    Double d26 = this.willItRain;
                    int hashCode19 = (hashCode18 + (d26 == null ? 0 : d26.hashCode())) * 31;
                    Double d27 = this.willItSnow;
                    int hashCode20 = (hashCode19 + (d27 == null ? 0 : d27.hashCode())) * 31;
                    Double d28 = this.windDegree;
                    int hashCode21 = (hashCode20 + (d28 == null ? 0 : d28.hashCode())) * 31;
                    String str3 = this.windDir;
                    int hashCode22 = (hashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Double d29 = this.windMps;
                    return hashCode22 + (d29 != null ? d29.hashCode() : 0);
                }

                public final Double isDay() {
                    return this.isDay;
                }

                public String toString() {
                    return "Hour(airQualityIndex=" + this.airQualityIndex + ", airQualityText=" + this.airQualityText + ", chanceOfRain=" + this.chanceOfRain + ", chanceOfSnow=" + this.chanceOfSnow + ", cloud=" + this.cloud + ", conditionCode=" + this.conditionCode + ", dewpointC=" + this.dewpointC + ", dewpointF=" + this.dewpointF + ", humidity=" + this.humidity + ", isDay=" + this.isDay + ", pressureHPa=" + this.pressureHPa + ", snowCm=" + this.snowCm + ", tempC=" + this.tempC + ", tempF=" + this.tempF + ", time=" + this.time + ", timeEpoch=" + this.timeEpoch + ", uv=" + this.uv + ", visKm=" + this.visKm + ", willItRain=" + this.willItRain + ", willItSnow=" + this.willItSnow + ", windDegree=" + this.windDegree + ", windDir=" + this.windDir + ", windMps=" + this.windMps + ')';
                }

                public Hour(Double d10, String str, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, Double d21, Double d22, String str2, Double d23, Double d24, Double d25, Double d26, Double d27, Double d28, String str3, Double d29) {
                    this.airQualityIndex = d10;
                    this.airQualityText = str;
                    this.chanceOfRain = d11;
                    this.chanceOfSnow = d12;
                    this.cloud = d13;
                    this.conditionCode = d14;
                    this.dewpointC = d15;
                    this.dewpointF = d16;
                    this.humidity = d17;
                    this.isDay = d18;
                    this.pressureHPa = d19;
                    this.snowCm = d20;
                    this.tempC = d21;
                    this.tempF = d22;
                    this.time = str2;
                    this.timeEpoch = d23;
                    this.uv = d24;
                    this.visKm = d25;
                    this.willItRain = d26;
                    this.willItSnow = d27;
                    this.windDegree = d28;
                    this.windDir = str3;
                    this.windMps = d29;
                }

                public /* synthetic */ Hour(Double d10, String str, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, Double d21, Double d22, String str2, Double d23, Double d24, Double d25, Double d26, Double d27, Double d28, String str3, Double d29, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? null : d12, (i10 & 16) != 0 ? null : d13, (i10 & 32) != 0 ? null : d14, (i10 & 64) != 0 ? null : d15, (i10 & 128) != 0 ? null : d16, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : d17, (i10 & 512) != 0 ? null : d18, (i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : d19, (i10 & 2048) != 0 ? null : d20, (i10 & 4096) != 0 ? null : d21, (i10 & 8192) != 0 ? null : d22, (i10 & JsonLexerKt.BATCH_SIZE) != 0 ? null : str2, (i10 & 32768) != 0 ? null : d23, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : d24, (i10 & 131072) != 0 ? null : d25, (i10 & 262144) != 0 ? null : d26, (i10 & 524288) != 0 ? null : d27, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d28, (i10 & 2097152) != 0 ? null : str3, (i10 & 4194304) != 0 ? null : d29);
                }
            }

            public Forecast() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Forecast copy$default(Forecast forecast, String str, Double d10, Day day, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = forecast.date;
                }
                if ((i10 & 2) != 0) {
                    d10 = forecast.dateEpoch;
                }
                if ((i10 & 4) != 0) {
                    day = forecast.day;
                }
                if ((i10 & 8) != 0) {
                    list = forecast.hour;
                }
                return forecast.copy(str, d10, day, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDate() {
                return this.date;
            }

            /* renamed from: component2, reason: from getter */
            public final Double getDateEpoch() {
                return this.dateEpoch;
            }

            /* renamed from: component3, reason: from getter */
            public final Day getDay() {
                return this.day;
            }

            public final List<Hour> component4() {
                return this.hour;
            }

            public final Forecast copy(String date, Double dateEpoch, Day day, List<Hour> hour) {
                return new Forecast(date, dateEpoch, day, hour);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Forecast)) {
                    return false;
                }
                Forecast forecast = (Forecast) other;
                return Intrinsics.areEqual(this.date, forecast.date) && Intrinsics.areEqual((Object) this.dateEpoch, (Object) forecast.dateEpoch) && Intrinsics.areEqual(this.day, forecast.day) && Intrinsics.areEqual(this.hour, forecast.hour);
            }

            public final String getDate() {
                return this.date;
            }

            public final Double getDateEpoch() {
                return this.dateEpoch;
            }

            public final Day getDay() {
                return this.day;
            }

            public final List<Hour> getHour() {
                return this.hour;
            }

            public int hashCode() {
                String str = this.date;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Double d10 = this.dateEpoch;
                int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
                Day day = this.day;
                int hashCode3 = (hashCode2 + (day == null ? 0 : day.hashCode())) * 31;
                List<Hour> list = this.hour;
                return hashCode3 + (list != null ? list.hashCode() : 0);
            }

            public String toString() {
                return "Forecast(date=" + this.date + ", dateEpoch=" + this.dateEpoch + ", day=" + this.day + ", hour=" + this.hour + ')';
            }

            public Forecast(String str, Double d10, Day day, List<Hour> list) {
                this.date = str;
                this.dateEpoch = d10;
                this.day = day;
                this.hour = list;
            }

            public /* synthetic */ Forecast(String str, Double d10, Day day, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : day, (i10 & 8) != 0 ? null : list);
            }
        }

        public Data(List<Alert> alerts, Current current, List<Forecast> forecast, String time) {
            Intrinsics.checkNotNullParameter(alerts, "alerts");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(forecast, "forecast");
            Intrinsics.checkNotNullParameter(time, "time");
            this.alerts = alerts;
            this.current = current;
            this.forecast = forecast;
            this.time = time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, Current current, List list2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = data.alerts;
            }
            if ((i10 & 2) != 0) {
                current = data.current;
            }
            if ((i10 & 4) != 0) {
                list2 = data.forecast;
            }
            if ((i10 & 8) != 0) {
                str = data.time;
            }
            return data.copy(list, current, list2, str);
        }

        public final List<Alert> component1() {
            return this.alerts;
        }

        /* renamed from: component2, reason: from getter */
        public final Current getCurrent() {
            return this.current;
        }

        public final List<Forecast> component3() {
            return this.forecast;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public final Data copy(List<Alert> alerts, Current current, List<Forecast> forecast, String time) {
            Intrinsics.checkNotNullParameter(alerts, "alerts");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(forecast, "forecast");
            Intrinsics.checkNotNullParameter(time, "time");
            return new Data(alerts, current, forecast, time);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.alerts, data.alerts) && Intrinsics.areEqual(this.current, data.current) && Intrinsics.areEqual(this.forecast, data.forecast) && Intrinsics.areEqual(this.time, data.time);
        }

        public final List<Alert> getAlerts() {
            return this.alerts;
        }

        public final Current getCurrent() {
            return this.current;
        }

        public final List<Forecast> getForecast() {
            return this.forecast;
        }

        public final String getTime() {
            return this.time;
        }

        public int hashCode() {
            return this.time.hashCode() + vd.e.d(this.forecast, (this.current.hashCode() + (this.alerts.hashCode() * 31)) * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Data(alerts=");
            sb2.append(this.alerts);
            sb2.append(", current=");
            sb2.append(this.current);
            sb2.append(", forecast=");
            sb2.append(this.forecast);
            sb2.append(", time=");
            return e.g(sb2, this.time, ')');
        }
    }

    public ResponseWeatherDto(String code, Data data, String message, String path, int i10, String timestamp) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.code = code;
        this.data = data;
        this.message = message;
        this.path = path;
        this.statusCode = i10;
        this.timestamp = timestamp;
    }

    public static /* synthetic */ ResponseWeatherDto copy$default(ResponseWeatherDto responseWeatherDto, String str, Data data, String str2, String str3, int i10, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = responseWeatherDto.code;
        }
        if ((i11 & 2) != 0) {
            data = responseWeatherDto.data;
        }
        Data data2 = data;
        if ((i11 & 4) != 0) {
            str2 = responseWeatherDto.message;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = responseWeatherDto.path;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            i10 = responseWeatherDto.statusCode;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            str4 = responseWeatherDto.timestamp;
        }
        return responseWeatherDto.copy(str, data2, str5, str6, i12, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component5, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final ResponseWeatherDto copy(String code, Data data, String message, String path, int statusCode, String timestamp) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new ResponseWeatherDto(code, data, message, path, statusCode, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseWeatherDto)) {
            return false;
        }
        ResponseWeatherDto responseWeatherDto = (ResponseWeatherDto) other;
        return Intrinsics.areEqual(this.code, responseWeatherDto.code) && Intrinsics.areEqual(this.data, responseWeatherDto.data) && Intrinsics.areEqual(this.message, responseWeatherDto.message) && Intrinsics.areEqual(this.path, responseWeatherDto.path) && this.statusCode == responseWeatherDto.statusCode && Intrinsics.areEqual(this.timestamp, responseWeatherDto.timestamp);
    }

    public final String getCode() {
        return this.code;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.timestamp.hashCode() + a.e(this.statusCode, vd.e.c(this.path, vd.e.c(this.message, (this.data.hashCode() + (this.code.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResponseWeatherDto(code=");
        sb2.append(this.code);
        sb2.append(", data=");
        sb2.append(this.data);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", statusCode=");
        sb2.append(this.statusCode);
        sb2.append(", timestamp=");
        return e.g(sb2, this.timestamp, ')');
    }
}
