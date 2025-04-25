package com.glority.android.cmsui2.util;

import androidx.exifinterface.media.ExifInterface;
import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.core.utils.data.PersistData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GradingLevelScaleConvertor.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u00011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0005J\u001a\u0010+\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020\u001fJ\u001a\u0010.\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020\u001fJ\u0014\u0010/\u001a\u0004\u0018\u00010\u00052\b\u00100\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b0\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R'\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/glority/android/cmsui2/util/GradingLevelScaleConvertor;", "", "<init>", "()V", "keyDefaultScale", "", "getKeyDefaultScale", "()Ljava/lang/String;", "UNCERTAIN_LEVEL", "", "scaleTypes", "", "getScaleTypes", "()Ljava/util/Map;", "sheldonLevel", "", "Lcom/glority/android/cmsui2/entity/GradeItem;", "getSheldonLevel", "()Ljava/util/List;", "frLevel", "getFrLevel", "esLevel", "getEsLevel", "itLevel", "getItLevel", "deLevel", "getDeLevel", "ptLevel", "getPtLevel", "typeLevelMap", "Ljava/util/HashMap;", "Lcom/glority/android/cmsui2/util/GradingLevelScaleConvertor$ScaleType;", "getTypeLevelMap", "()Ljava/util/HashMap;", "levelEquals", "", "level1", "level2", "getDefaultScaleType", "country", "cacheScaleType", "", "type", "gradeConvertLongName", "name", "toScaleType", "gradeConvertShortName", "oldScaleTypeMap", "scaleType", "ScaleType", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class GradingLevelScaleConvertor {
    private static final Void UNCERTAIN_LEVEL = null;
    private static final List<GradeItem> deLevel;
    private static final List<GradeItem> esLevel;
    private static final List<GradeItem> frLevel;
    private static final List<GradeItem> itLevel;
    private static final List<GradeItem> ptLevel;
    private static final List<GradeItem> sheldonLevel;
    private static final HashMap<ScaleType, List<? extends GradeItem>> typeLevelMap;
    public static final GradingLevelScaleConvertor INSTANCE = new GradingLevelScaleConvertor();
    private static final String keyDefaultScale = "keyDefaultScale";
    private static final Map<String, Map<String, Map<String, String>>> scaleTypes = MapsKt.mapOf(TuplesKt.to("ms", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "ms"), TuplesKt.to("name", "MS (Mint State)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "fdc"), TuplesKt.to("name", "FDC (Fleur de Coin)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "fdc"), TuplesKt.to("name", "FDC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "fdc"), TuplesKt.to("name", "FDC"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "stgl"), TuplesKt.to("name", "STGL (Stempelglanz)"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "fdc"), TuplesKt.to("name", "FDC (Flor de Cunho)"))))), TuplesKt.to("au", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "au"), TuplesKt.to("name", "AU (About Uncirculated)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "spl"), TuplesKt.to("name", "SPL (Splendide)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "sc"), TuplesKt.to("name", "SC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "mspl"), TuplesKt.to("name", "MSPL (MoltoSplendido)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "unz"), TuplesKt.to("name", "UNZ (Fast unzirkuliert)"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "soberba"), TuplesKt.to("name", "Soberba"))))), TuplesKt.to("xf", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "xf"), TuplesKt.to("name", "XF (Extremely fine)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "sup"), TuplesKt.to("name", "SUP (Superbe)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "ebc"), TuplesKt.to("name", "EBC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "spl"), TuplesKt.to("name", "SPL (Splendido)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "vz"), TuplesKt.to("name", "VZ (Vorzüglich)"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "bela"), TuplesKt.to("name", "Bela"))))), TuplesKt.to("vf", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "vf"), TuplesKt.to("name", "VF (Very fine)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "ttb"), TuplesKt.to("name", "TTB (Très Très Beau)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "mbc"), TuplesKt.to("name", "MBC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "bb"), TuplesKt.to("name", "BB (Bellissimo)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "ss"), TuplesKt.to("name", "SS (Sehr schön)"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "mbc"), TuplesKt.to("name", "MBC"))))), TuplesKt.to("f", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "f"), TuplesKt.to("name", "F (Fine)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", TtmlNode.VERTICAL), TuplesKt.to("name", "TB (Très Beau)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "bc+"), TuplesKt.to("name", "BC+"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "mb"), TuplesKt.to("name", "MB (Molto Bello)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "s"), TuplesKt.to("name", "S (Schön)"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "bc"), TuplesKt.to("name", "BC"))))), TuplesKt.to("vg", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "vg"), TuplesKt.to("name", "VG (Very good)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "b"), TuplesKt.to("name", "B (Beau)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "bc"), TuplesKt.to("name", "BC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "b"), TuplesKt.to("name", "B (Bello)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "sge"), TuplesKt.to("name", "SGE (Sehr gut erhalten)"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "mreg"), TuplesKt.to("name", "MREG"))))), TuplesKt.to("g", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "g"), TuplesKt.to("name", "G (Good)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "ab"), TuplesKt.to("name", "AB (Assez Beau)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "rc"), TuplesKt.to("name", "RC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "b"), TuplesKt.to("name", "B (Bello)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "ge"), TuplesKt.to("name", "GE"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "reg"), TuplesKt.to("name", "REG"))))), TuplesKt.to("ag", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "ag"), TuplesKt.to("name", "AG (About Good)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "ab"), TuplesKt.to("name", "AB (Assez Beau)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "rc"), TuplesKt.to("name", "RC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "b"), TuplesKt.to("name", "B (Bello)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "ge"), TuplesKt.to("name", "GE"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "reg"), TuplesKt.to("name", "REG"))))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", "fr"), TuplesKt.to("name", "FR (Fair)"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "ab"), TuplesKt.to("name", "AB (Assez Beau)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "rc"), TuplesKt.to("name", "RC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "b"), TuplesKt.to("name", "B (Bello)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "ge"), TuplesKt.to("name", "GE"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "reg"), TuplesKt.to("name", "REG"))))), TuplesKt.to(TtmlNode.TAG_P, MapsKt.mapOf(TuplesKt.to("sheldon", MapsKt.mapOf(TuplesKt.to("type", TtmlNode.TAG_P), TuplesKt.to("name", "P (Poor"))), TuplesKt.to("fr", MapsKt.mapOf(TuplesKt.to("type", "ab"), TuplesKt.to("name", "AB (Assez Beau)"))), TuplesKt.to("es", MapsKt.mapOf(TuplesKt.to("type", "rc"), TuplesKt.to("name", "RC"))), TuplesKt.to("it", MapsKt.mapOf(TuplesKt.to("type", "b"), TuplesKt.to("name", "B (Bello)"))), TuplesKt.to("de", MapsKt.mapOf(TuplesKt.to("type", "ge"), TuplesKt.to("name", "GE"))), TuplesKt.to("pt", MapsKt.mapOf(TuplesKt.to("type", "reg"), TuplesKt.to("name", "REG"))))));

    private GradingLevelScaleConvertor() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj = UNCERTAIN_LEVEL;
        List<GradeItem> mutableListOf = CollectionsKt.mutableListOf(new GradeItem("P (Poor)", "P", CollectionsKt.listOf((Object[]) new Integer[]{obj, 1})), new GradeItem("FR (Fair)", "FR", CollectionsKt.listOf((Object[]) new Integer[]{obj, 2})), new GradeItem("AG (About Good)", "AG", CollectionsKt.listOf((Object[]) new Integer[]{obj, 3})), new GradeItem("G (Good)", "G", CollectionsKt.listOf((Object[]) new Integer[]{obj, 6, 4})), new GradeItem("VG (Very good)", "VG", CollectionsKt.listOf((Object[]) new Integer[]{obj, 10, 8})), new GradeItem("F (Fine)", "F", CollectionsKt.listOf((Object[]) new Integer[]{obj, 15, 12})), new GradeItem("VF (Very fine)", "VF", CollectionsKt.listOf((Object[]) new Integer[]{obj, 35, 30, 25, 20})), new GradeItem("XF (Extremely fine)", "XF", CollectionsKt.listOf((Object[]) new Integer[]{obj, 45, 40})), new GradeItem("AU (About Uncirculated)", "AU", CollectionsKt.listOf((Object[]) new Integer[]{obj, 58, 55, 53, 50})), new GradeItem("MS (Mint State)", "MS", CollectionsKt.listOf((Object[]) new Integer[]{obj, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60})), new GradeItem((String) obj, (String) obj, CollectionsKt.emptyList()));
        sheldonLevel = mutableListOf;
        List<GradeItem> mutableListOf2 = CollectionsKt.mutableListOf(null, null, null, new GradeItem("AB (Assez Beau)", "AB", null), new GradeItem("B (Beau)", "B", null), new GradeItem("TB (Très Beau)", "TB", null), new GradeItem("TTB (Très Très Beau)", "TTB", null), new GradeItem("SUP (Superbe)", "SUP", null), new GradeItem("SPL (Splendide)", "SPL", null), new GradeItem("FDC (Fleur de Coin)", "FDC", null));
        frLevel = mutableListOf2;
        List<GradeItem> mutableListOf3 = CollectionsKt.mutableListOf(null, null, null, new GradeItem("RC", "RC", null), new GradeItem("BC", "BC", null), new GradeItem("BC+", "BC+", null), new GradeItem("MBC", "MBC", null), new GradeItem("EBC", "EBC", null), new GradeItem("SC", "SC", null), new GradeItem("FDC", "FDC", null));
        esLevel = mutableListOf3;
        List<GradeItem> mutableListOf4 = CollectionsKt.mutableListOf(null, null, null, null, new GradeItem("B (Bello)", "B", null), new GradeItem("MB (Molto Bello)", "MB", null), new GradeItem("BB (Bellissimo)", "BB", null), new GradeItem("SPL (Splendido)", "SPL", null), new GradeItem("MSPL (MoltoSplendido)", "MSPL", null), new GradeItem("FDC", "FDC", null));
        itLevel = mutableListOf4;
        List<GradeItem> mutableListOf5 = CollectionsKt.mutableListOf(null, null, null, new GradeItem("GE (Gut erhalten)", "GE", null), new GradeItem("SGE (Sehr gut erhalten)", "SGE", null), new GradeItem("S (Schön)", ExifInterface.LATITUDE_SOUTH, null), new GradeItem("SS (Sehr schön)", "SS", null), new GradeItem("VZ (Vorzüglich)", "VZ", null), new GradeItem("UNZ (Fast unzirkuliert)", "UNZ", null), new GradeItem("STGL (Stempelglanz)", "STGL", null));
        deLevel = mutableListOf5;
        List<GradeItem> mutableListOf6 = CollectionsKt.mutableListOf(null, null, null, new GradeItem("REG", "REG", null), new GradeItem("MREG", "MREG", null), new GradeItem("BC", "BC", null), new GradeItem("MBC", "MBC", null), new GradeItem("Bela", "Bela", null), new GradeItem("Soberba", "Soberba", null), new GradeItem("FDC (Flor de Cunho)", "FDC", null));
        ptLevel = mutableListOf6;
        typeLevelMap = MapsKt.hashMapOf(new Pair(ScaleType.sheldon, mutableListOf), new Pair(ScaleType.france, mutableListOf2), new Pair(ScaleType.spain, mutableListOf3), new Pair(ScaleType.italy, mutableListOf4), new Pair(ScaleType.germany, mutableListOf5), new Pair(ScaleType.portugal, mutableListOf6));
    }

    public final String getKeyDefaultScale() {
        return keyDefaultScale;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GradingLevelScaleConvertor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/cmsui2/util/GradingLevelScaleConvertor$ScaleType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "sheldon", "france", "spain", "italy", "germany", "portugal", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes14.dex */
    public static final class ScaleType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ScaleType[] $VALUES;
        private final String type;
        public static final ScaleType sheldon = new ScaleType("sheldon", 0, "sheldon");
        public static final ScaleType france = new ScaleType("france", 1, "fr");
        public static final ScaleType spain = new ScaleType("spain", 2, "es");
        public static final ScaleType italy = new ScaleType("italy", 3, "it");
        public static final ScaleType germany = new ScaleType("germany", 4, "de");
        public static final ScaleType portugal = new ScaleType("portugal", 5, "pt");

        private static final /* synthetic */ ScaleType[] $values() {
            return new ScaleType[]{sheldon, france, spain, italy, germany, portugal};
        }

        public static EnumEntries<ScaleType> getEntries() {
            return $ENTRIES;
        }

        private ScaleType(String str, int i, String str2) {
            this.type = str2;
        }

        public final String getType() {
            return this.type;
        }

        static {
            ScaleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    public final Map<String, Map<String, Map<String, String>>> getScaleTypes() {
        return scaleTypes;
    }

    public final List<GradeItem> getSheldonLevel() {
        return sheldonLevel;
    }

    public final List<GradeItem> getFrLevel() {
        return frLevel;
    }

    public final List<GradeItem> getEsLevel() {
        return esLevel;
    }

    public final List<GradeItem> getItLevel() {
        return itLevel;
    }

    public final List<GradeItem> getDeLevel() {
        return deLevel;
    }

    public final List<GradeItem> getPtLevel() {
        return ptLevel;
    }

    public final HashMap<ScaleType, List<? extends GradeItem>> getTypeLevelMap() {
        return typeLevelMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean levelEquals(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
            if (r0 == 0) goto L8
            r10 = 1
            return r10
        L8:
            java.lang.String r0 = "toLowerCase(...)"
            r1 = 0
            if (r10 == 0) goto L24
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = r10.toLowerCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            if (r3 == 0) goto L24
            r7 = 4
            r8 = 0
            java.lang.String r4 = " "
            java.lang.String r5 = ""
            r6 = 0
            java.lang.String r10 = kotlin.text.StringsKt.replace$default(r3, r4, r5, r6, r7, r8)
            goto L25
        L24:
            r10 = r1
        L25:
            if (r11 == 0) goto L3d
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = r11.toLowerCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            if (r3 == 0) goto L3d
            r7 = 4
            r8 = 0
            java.lang.String r4 = " "
            java.lang.String r5 = ""
            r6 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default(r3, r4, r5, r6, r7, r8)
        L3d:
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui2.util.GradingLevelScaleConvertor.levelEquals(java.lang.String, java.lang.String):boolean");
    }

    public final ScaleType getDefaultScaleType(String country) {
        List listOf;
        ScaleType scaleType;
        Intrinsics.checkNotNullParameter(country, "country");
        try {
            ScaleType[] values = ScaleType.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (ScaleType scaleType2 : values) {
                arrayList.add(scaleType2.getType());
            }
            String lowerCase = country.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (arrayList.contains(lowerCase)) {
                ScaleType[] scaleTypeArr = new ScaleType[2];
                ScaleType[] values2 = ScaleType.values();
                int length = values2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        scaleType = null;
                        break;
                    }
                    scaleType = values2[i];
                    if (StringsKt.equals(scaleType.getType(), country, true)) {
                        break;
                    }
                    i++;
                }
                scaleTypeArr[0] = scaleType;
                scaleTypeArr[1] = ScaleType.sheldon;
                listOf = CollectionsKt.listOf((Object[]) scaleTypeArr);
            } else {
                listOf = CollectionsKt.listOf(ScaleType.sheldon);
            }
            String oldScaleTypeMap = oldScaleTypeMap((String) PersistData.INSTANCE.get(keyDefaultScale, null));
            if (oldScaleTypeMap == null) {
                Object first = CollectionsKt.first((List<? extends Object>) listOf);
                Intrinsics.checkNotNull(first);
                return (ScaleType) first;
            }
            ScaleType valueOf = ScaleType.valueOf(oldScaleTypeMap);
            if (listOf.contains(valueOf)) {
                return valueOf;
            }
            Object first2 = CollectionsKt.first((List<? extends Object>) listOf);
            Intrinsics.checkNotNull(first2);
            return (ScaleType) first2;
        } catch (Throwable unused) {
            return ScaleType.sheldon;
        }
    }

    public final void cacheScaleType(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        PersistData.INSTANCE.set(keyDefaultScale, type);
    }

    public final GradeItem gradeConvertLongName(String name, ScaleType toScaleType) {
        Integer num;
        List<? extends GradeItem> list;
        Object obj;
        String displayGradeNameId;
        Intrinsics.checkNotNullParameter(toScaleType, "toScaleType");
        if (name == null) {
            return null;
        }
        ScaleType scaleType = null;
        for (Map.Entry<ScaleType, List<? extends GradeItem>> entry : typeLevelMap.entrySet()) {
            Iterator<T> it = entry.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                GradeItem gradeItem = (GradeItem) obj;
                if (Intrinsics.areEqual((gradeItem == null || (displayGradeNameId = gradeItem.getDisplayGradeNameId()) == null) ? null : StringsKt.replace$default(displayGradeNameId, " ", "", false, 4, (Object) null), StringsKt.replace$default(name, " ", "", false, 4, (Object) null))) {
                    break;
                }
            }
            if (obj != null) {
                scaleType = entry.getKey();
            }
        }
        if (scaleType == null) {
            return null;
        }
        List<? extends GradeItem> list2 = typeLevelMap.get(scaleType);
        if (list2 != null) {
            Iterator<? extends GradeItem> it2 = list2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                GradeItem next = it2.next();
                if (INSTANCE.levelEquals(next != null ? next.getDisplayGradeNameId() : null, name)) {
                    break;
                }
                i++;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        if (num == null || num.intValue() == -1 || (list = typeLevelMap.get(toScaleType)) == null) {
            return null;
        }
        return list.get(num.intValue());
    }

    public final GradeItem gradeConvertShortName(String name, ScaleType toScaleType) {
        Integer num;
        Object obj;
        String str;
        Object obj2;
        String str2;
        String shortNameId;
        Intrinsics.checkNotNullParameter(toScaleType, "toScaleType");
        if (name == null) {
            return null;
        }
        String str3 = name;
        String str4 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) str3, new String[]{"-"}, false, 0, 6, (Object) null));
        String str5 = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) str3, new String[]{"-"}, false, 0, 6, (Object) null), 1);
        ScaleType scaleType = null;
        for (Map.Entry<ScaleType, List<? extends GradeItem>> entry : typeLevelMap.entrySet()) {
            Iterator<T> it = entry.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = str4;
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                GradeItem gradeItem = (GradeItem) obj2;
                String replace$default = (gradeItem == null || (shortNameId = gradeItem.getShortNameId()) == null) ? null : StringsKt.replace$default(shortNameId, " ", "", false, 4, (Object) null);
                if (str4 != null) {
                    str = str4;
                    str2 = StringsKt.replace$default(str4, " ", "", false, 4, (Object) null);
                } else {
                    str = str4;
                    str2 = null;
                }
                if (Intrinsics.areEqual(replace$default, str2)) {
                    break;
                }
                str4 = str;
            }
            if (obj2 != null) {
                scaleType = entry.getKey();
            }
            str4 = str;
        }
        String str6 = str4;
        if (scaleType == null) {
            return null;
        }
        List<? extends GradeItem> list = typeLevelMap.get(scaleType);
        if (list != null) {
            Iterator<? extends GradeItem> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                GradeItem next = it2.next();
                String str7 = str6;
                if (INSTANCE.levelEquals(next != null ? next.getShortNameId() : null, str7)) {
                    break;
                }
                i++;
                str6 = str7;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        List<? extends GradeItem> list2 = typeLevelMap.get(toScaleType);
        if (num == null || num.intValue() == -1 || list2 == null) {
            return null;
        }
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            GradeItem gradeItem2 = (GradeItem) obj;
            if (gradeItem2 != null && CollectionsKt.indexOf(list2, gradeItem2) >= num.intValue()) {
                break;
            }
        }
        GradeItem gradeItem3 = (GradeItem) obj;
        GradeItem clone = gradeItem3 != null ? gradeItem3.clone() : null;
        if (clone != null) {
            clone.setLevel(str5 != null ? StringsKt.toIntOrNull(str5) : null);
        }
        return clone;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final String oldScaleTypeMap(String scaleType) {
        if (scaleType != null) {
            switch (scaleType.hashCode()) {
                case -1266513893:
                    if (scaleType.equals("france")) {
                        return "fr";
                    }
                    break;
                case -76231757:
                    if (scaleType.equals("germany")) {
                        return "de";
                    }
                    break;
                case 100522147:
                    if (scaleType.equals("italy")) {
                        return "it";
                    }
                    break;
                case 109638089:
                    if (scaleType.equals("spain")) {
                        return "es";
                    }
                    break;
                case 729361982:
                    if (scaleType.equals("portugal")) {
                        return "pt";
                    }
                    break;
                case 2057732615:
                    if (scaleType.equals("sheldon")) {
                        return "sheldon";
                    }
                    break;
            }
        }
        return null;
    }
}
