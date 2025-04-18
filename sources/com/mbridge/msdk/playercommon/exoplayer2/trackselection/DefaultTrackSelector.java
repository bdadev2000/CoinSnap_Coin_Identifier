package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    private static final int[] NO_TRACKS = new int[0];
    private static final int WITHIN_RENDERER_CAPABILITIES_BONUS = 1000;
    private final TrackSelection.Factory adaptiveTrackSelectionFactory;
    private final AtomicReference<Parameters> parametersReference;

    /* loaded from: classes4.dex */
    public static final class AudioConfigurationTuple {
        public final int channelCount;
        public final String mimeType;
        public final int sampleRate;

        public AudioConfigurationTuple(int i10, int i11, String str) {
            this.channelCount = i10;
            this.sampleRate = i11;
            this.mimeType = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AudioConfigurationTuple.class != obj.getClass()) {
                return false;
            }
            AudioConfigurationTuple audioConfigurationTuple = (AudioConfigurationTuple) obj;
            if (this.channelCount == audioConfigurationTuple.channelCount && this.sampleRate == audioConfigurationTuple.sampleRate && TextUtils.equals(this.mimeType, audioConfigurationTuple.mimeType)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int i11 = ((this.channelCount * 31) + this.sampleRate) * 31;
            String str = this.mimeType;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }
    }

    /* loaded from: classes4.dex */
    public static final class AudioTrackScore implements Comparable<AudioTrackScore> {
        private final int bitrate;
        private final int channelCount;
        private final int defaultSelectionFlagScore;
        private final int matchLanguageScore;
        private final Parameters parameters;
        private final int sampleRate;
        private final int withinRendererCapabilitiesScore;

        public AudioTrackScore(Format format, Parameters parameters, int i10) {
            this.parameters = parameters;
            this.withinRendererCapabilitiesScore = DefaultTrackSelector.isSupported(i10, false) ? 1 : 0;
            this.matchLanguageScore = DefaultTrackSelector.formatHasLanguage(format, parameters.preferredAudioLanguage) ? 1 : 0;
            this.defaultSelectionFlagScore = (format.selectionFlags & 1) != 0 ? 1 : 0;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.bitrate = format.bitrate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AudioTrackScore.class != obj.getClass()) {
                return false;
            }
            AudioTrackScore audioTrackScore = (AudioTrackScore) obj;
            if (this.withinRendererCapabilitiesScore == audioTrackScore.withinRendererCapabilitiesScore && this.matchLanguageScore == audioTrackScore.matchLanguageScore && this.defaultSelectionFlagScore == audioTrackScore.defaultSelectionFlagScore && this.channelCount == audioTrackScore.channelCount && this.sampleRate == audioTrackScore.sampleRate && this.bitrate == audioTrackScore.bitrate) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((this.withinRendererCapabilitiesScore * 31) + this.matchLanguageScore) * 31) + this.defaultSelectionFlagScore) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.bitrate;
        }

        @Override // java.lang.Comparable
        public final int compareTo(AudioTrackScore audioTrackScore) {
            int i10 = this.withinRendererCapabilitiesScore;
            int i11 = audioTrackScore.withinRendererCapabilitiesScore;
            if (i10 != i11) {
                return DefaultTrackSelector.compareInts(i10, i11);
            }
            int i12 = this.matchLanguageScore;
            int i13 = audioTrackScore.matchLanguageScore;
            if (i12 != i13) {
                return DefaultTrackSelector.compareInts(i12, i13);
            }
            int i14 = this.defaultSelectionFlagScore;
            int i15 = audioTrackScore.defaultSelectionFlagScore;
            if (i14 != i15) {
                return DefaultTrackSelector.compareInts(i14, i15);
            }
            if (this.parameters.forceLowestBitrate) {
                return DefaultTrackSelector.compareInts(audioTrackScore.bitrate, this.bitrate);
            }
            int i16 = i10 != 1 ? -1 : 1;
            int i17 = this.channelCount;
            int i18 = audioTrackScore.channelCount;
            if (i17 != i18) {
                return DefaultTrackSelector.compareInts(i17, i18) * i16;
            }
            int i19 = this.sampleRate;
            int i20 = audioTrackScore.sampleRate;
            if (i19 != i20) {
                return DefaultTrackSelector.compareInts(i19, i20) * i16;
            }
            return DefaultTrackSelector.compareInts(this.bitrate, audioTrackScore.bitrate) * i16;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Parameters implements Parcelable {
        public final boolean allowMixedMimeAdaptiveness;
        public final boolean allowNonSeamlessAdaptiveness;
        public final int disabledTextTrackSelectionFlags;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final boolean forceLowestBitrate;
        public final int maxVideoBitrate;
        public final int maxVideoHeight;
        public final int maxVideoWidth;
        public final String preferredAudioLanguage;
        public final String preferredTextLanguage;
        private final SparseBooleanArray rendererDisabledFlags;
        public final boolean selectUndeterminedTextLanguage;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final int tunnelingAudioSessionId;
        public final int viewportHeight;
        public final boolean viewportOrientationMayChange;
        public final int viewportWidth;
        public static final Parameters DEFAULT = new Parameters();
        public static final Parcelable.Creator<Parameters> CREATOR = new Parcelable.Creator<Parameters>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.Parameters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters[] newArray(int i10) {
                return new Parameters[i10];
            }
        };

        private Parameters() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> readSelectionOverrides(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i11 = 0; i11 < readInt3; i11++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                Map<TrackGroupArray, SelectionOverride> valueAt = sparseArray.valueAt(i10);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        public final ParametersBuilder buildUpon() {
            return new ParametersBuilder(this);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            if (this.selectUndeterminedTextLanguage == parameters.selectUndeterminedTextLanguage && this.disabledTextTrackSelectionFlags == parameters.disabledTextTrackSelectionFlags && this.forceLowestBitrate == parameters.forceLowestBitrate && this.allowMixedMimeAdaptiveness == parameters.allowMixedMimeAdaptiveness && this.allowNonSeamlessAdaptiveness == parameters.allowNonSeamlessAdaptiveness && this.maxVideoWidth == parameters.maxVideoWidth && this.maxVideoHeight == parameters.maxVideoHeight && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.viewportOrientationMayChange == parameters.viewportOrientationMayChange && this.viewportWidth == parameters.viewportWidth && this.viewportHeight == parameters.viewportHeight && this.maxVideoBitrate == parameters.maxVideoBitrate && this.tunnelingAudioSessionId == parameters.tunnelingAudioSessionId && TextUtils.equals(this.preferredAudioLanguage, parameters.preferredAudioLanguage) && TextUtils.equals(this.preferredTextLanguage, parameters.preferredTextLanguage) && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                return true;
            }
            return false;
        }

        public final boolean getRendererDisabled(int i10) {
            return this.rendererDisabledFlags.get(i10);
        }

        public final SelectionOverride getSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean hasSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null && map.containsKey(trackGroupArray)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i10 = (((((((((((((((((((((((((((this.selectUndeterminedTextLanguage ? 1 : 0) * 31) + this.disabledTextTrackSelectionFlags) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.allowMixedMimeAdaptiveness ? 1 : 0)) * 31) + (this.allowNonSeamlessAdaptiveness ? 1 : 0)) * 31) + this.maxVideoWidth) * 31) + this.maxVideoHeight) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.maxVideoBitrate) * 31) + this.tunnelingAudioSessionId) * 31;
            String str = this.preferredAudioLanguage;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (i10 + hashCode) * 31;
            String str2 = this.preferredTextLanguage;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return i12 + i11;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            writeSelectionOverridesToParcel(parcel, this.selectionOverrides);
            parcel.writeSparseBooleanArray(this.rendererDisabledFlags);
            parcel.writeString(this.preferredAudioLanguage);
            parcel.writeString(this.preferredTextLanguage);
            Util.writeBoolean(parcel, this.selectUndeterminedTextLanguage);
            parcel.writeInt(this.disabledTextTrackSelectionFlags);
            Util.writeBoolean(parcel, this.forceLowestBitrate);
            Util.writeBoolean(parcel, this.allowMixedMimeAdaptiveness);
            Util.writeBoolean(parcel, this.allowNonSeamlessAdaptiveness);
            parcel.writeInt(this.maxVideoWidth);
            parcel.writeInt(this.maxVideoHeight);
            parcel.writeInt(this.maxVideoBitrate);
            Util.writeBoolean(parcel, this.exceedVideoConstraintsIfNecessary);
            Util.writeBoolean(parcel, this.exceedRendererCapabilitiesIfNecessary);
            parcel.writeInt(this.viewportWidth);
            parcel.writeInt(this.viewportHeight);
            Util.writeBoolean(parcel, this.viewportOrientationMayChange);
            parcel.writeInt(this.tunnelingAudioSessionId);
        }

        public Parameters(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, int i13, boolean z14, boolean z15, int i14, int i15, boolean z16, int i16) {
            this.selectionOverrides = sparseArray;
            this.rendererDisabledFlags = sparseBooleanArray;
            this.preferredAudioLanguage = Util.normalizeLanguageCode(str);
            this.preferredTextLanguage = Util.normalizeLanguageCode(str2);
            this.selectUndeterminedTextLanguage = z10;
            this.disabledTextTrackSelectionFlags = i10;
            this.forceLowestBitrate = z11;
            this.allowMixedMimeAdaptiveness = z12;
            this.allowNonSeamlessAdaptiveness = z13;
            this.maxVideoWidth = i11;
            this.maxVideoHeight = i12;
            this.maxVideoBitrate = i13;
            this.exceedVideoConstraintsIfNecessary = z14;
            this.exceedRendererCapabilitiesIfNecessary = z15;
            this.viewportWidth = i14;
            this.viewportHeight = i15;
            this.viewportOrientationMayChange = z16;
            this.tunnelingAudioSessionId = i16;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public Parameters(Parcel parcel) {
            this.selectionOverrides = readSelectionOverrides(parcel);
            this.rendererDisabledFlags = parcel.readSparseBooleanArray();
            this.preferredAudioLanguage = parcel.readString();
            this.preferredTextLanguage = parcel.readString();
            this.selectUndeterminedTextLanguage = Util.readBoolean(parcel);
            this.disabledTextTrackSelectionFlags = parcel.readInt();
            this.forceLowestBitrate = Util.readBoolean(parcel);
            this.allowMixedMimeAdaptiveness = Util.readBoolean(parcel);
            this.allowNonSeamlessAdaptiveness = Util.readBoolean(parcel);
            this.maxVideoWidth = parcel.readInt();
            this.maxVideoHeight = parcel.readInt();
            this.maxVideoBitrate = parcel.readInt();
            this.exceedVideoConstraintsIfNecessary = Util.readBoolean(parcel);
            this.exceedRendererCapabilitiesIfNecessary = Util.readBoolean(parcel);
            this.viewportWidth = parcel.readInt();
            this.viewportHeight = parcel.readInt();
            this.viewportOrientationMayChange = Util.readBoolean(parcel);
            this.tunnelingAudioSessionId = parcel.readInt();
        }
    }

    /* loaded from: classes4.dex */
    public static final class ParametersBuilder {
        private boolean allowMixedMimeAdaptiveness;
        private boolean allowNonSeamlessAdaptiveness;
        private int disabledTextTrackSelectionFlags;
        private boolean exceedRendererCapabilitiesIfNecessary;
        private boolean exceedVideoConstraintsIfNecessary;
        private boolean forceLowestBitrate;
        private int maxVideoBitrate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private String preferredAudioLanguage;
        private String preferredTextLanguage;
        private final SparseBooleanArray rendererDisabledFlags;
        private boolean selectUndeterminedTextLanguage;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        private int tunnelingAudioSessionId;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        public final Parameters build() {
            return new Parameters(this.selectionOverrides, this.rendererDisabledFlags, this.preferredAudioLanguage, this.preferredTextLanguage, this.selectUndeterminedTextLanguage, this.disabledTextTrackSelectionFlags, this.forceLowestBitrate, this.allowMixedMimeAdaptiveness, this.allowNonSeamlessAdaptiveness, this.maxVideoWidth, this.maxVideoHeight, this.maxVideoBitrate, this.exceedVideoConstraintsIfNecessary, this.exceedRendererCapabilitiesIfNecessary, this.viewportWidth, this.viewportHeight, this.viewportOrientationMayChange, this.tunnelingAudioSessionId);
        }

        public final ParametersBuilder clearSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null && map.containsKey(trackGroupArray)) {
                map.remove(trackGroupArray);
                if (map.isEmpty()) {
                    this.selectionOverrides.remove(i10);
                }
            }
            return this;
        }

        public final ParametersBuilder clearSelectionOverrides(int i10) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null && !map.isEmpty()) {
                this.selectionOverrides.remove(i10);
            }
            return this;
        }

        public final ParametersBuilder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public final ParametersBuilder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public final ParametersBuilder setAllowMixedMimeAdaptiveness(boolean z10) {
            this.allowMixedMimeAdaptiveness = z10;
            return this;
        }

        public final ParametersBuilder setAllowNonSeamlessAdaptiveness(boolean z10) {
            this.allowNonSeamlessAdaptiveness = z10;
            return this;
        }

        public final ParametersBuilder setDisabledTextTrackSelectionFlags(int i10) {
            this.disabledTextTrackSelectionFlags = i10;
            return this;
        }

        public final ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z10) {
            this.exceedRendererCapabilitiesIfNecessary = z10;
            return this;
        }

        public final ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z10) {
            this.exceedVideoConstraintsIfNecessary = z10;
            return this;
        }

        public final ParametersBuilder setForceLowestBitrate(boolean z10) {
            this.forceLowestBitrate = z10;
            return this;
        }

        public final ParametersBuilder setMaxVideoBitrate(int i10) {
            this.maxVideoBitrate = i10;
            return this;
        }

        public final ParametersBuilder setMaxVideoSize(int i10, int i11) {
            this.maxVideoWidth = i10;
            this.maxVideoHeight = i11;
            return this;
        }

        public final ParametersBuilder setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public final ParametersBuilder setPreferredAudioLanguage(String str) {
            this.preferredAudioLanguage = str;
            return this;
        }

        public final ParametersBuilder setPreferredTextLanguage(String str) {
            this.preferredTextLanguage = str;
            return this;
        }

        public final ParametersBuilder setRendererDisabled(int i10, boolean z10) {
            if (this.rendererDisabledFlags.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.rendererDisabledFlags.put(i10, true);
            } else {
                this.rendererDisabledFlags.delete(i10);
            }
            return this;
        }

        public final ParametersBuilder setSelectUndeterminedTextLanguage(boolean z10) {
            this.selectUndeterminedTextLanguage = z10;
            return this;
        }

        public final ParametersBuilder setSelectionOverride(int i10, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.selectionOverrides.put(i10, map);
            }
            if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        public final ParametersBuilder setTunnelingAudioSessionId(int i10) {
            if (this.tunnelingAudioSessionId != i10) {
                this.tunnelingAudioSessionId = i10;
            }
            return this;
        }

        public final ParametersBuilder setViewportSize(int i10, int i11, boolean z10) {
            this.viewportWidth = i10;
            this.viewportHeight = i11;
            this.viewportOrientationMayChange = z10;
            return this;
        }

        public final ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            Point physicalDisplaySize = Util.getPhysicalDisplaySize(context);
            return setViewportSize(physicalDisplaySize.x, physicalDisplaySize.y, z10);
        }

        public ParametersBuilder() {
            this(Parameters.DEFAULT);
        }

        private ParametersBuilder(Parameters parameters) {
            this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
            this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            this.preferredAudioLanguage = parameters.preferredAudioLanguage;
            this.preferredTextLanguage = parameters.preferredTextLanguage;
            this.selectUndeterminedTextLanguage = parameters.selectUndeterminedTextLanguage;
            this.disabledTextTrackSelectionFlags = parameters.disabledTextTrackSelectionFlags;
            this.forceLowestBitrate = parameters.forceLowestBitrate;
            this.allowMixedMimeAdaptiveness = parameters.allowMixedMimeAdaptiveness;
            this.allowNonSeamlessAdaptiveness = parameters.allowNonSeamlessAdaptiveness;
            this.maxVideoWidth = parameters.maxVideoWidth;
            this.maxVideoHeight = parameters.maxVideoHeight;
            this.maxVideoBitrate = parameters.maxVideoBitrate;
            this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
            this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
            this.viewportWidth = parameters.viewportWidth;
            this.viewportHeight = parameters.viewportHeight;
            this.viewportOrientationMayChange = parameters.viewportOrientationMayChange;
            this.tunnelingAudioSessionId = parameters.tunnelingAudioSessionId;
        }

        public final ParametersBuilder clearSelectionOverrides() {
            if (this.selectionOverrides.size() == 0) {
                return this;
            }
            this.selectionOverrides.clear();
            return this;
        }
    }

    public DefaultTrackSelector() {
        this((TrackSelection.Factory) null);
    }

    private static int compareFormatValues(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareInts(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!isSupportedAdaptiveVideoTrack(trackGroup.getFormat(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                list.remove(size);
            }
        }
    }

    public static boolean formatHasLanguage(Format format, String str) {
        if (str != null && TextUtils.equals(str, Util.normalizeLanguageCode(format.language))) {
            return true;
        }
        return false;
    }

    public static boolean formatHasNoLanguage(Format format) {
        return TextUtils.isEmpty(format.language) || formatHasLanguage(format, C.LANGUAGE_UNDETERMINED);
    }

    private static int getAdaptiveAudioTrackCount(TrackGroup trackGroup, int[] iArr, AudioConfigurationTuple audioConfigurationTuple) {
        int i10 = 0;
        for (int i11 = 0; i11 < trackGroup.length; i11++) {
            if (isSupportedAdaptiveAudioTrack(trackGroup.getFormat(i11), iArr[i11], audioConfigurationTuple)) {
                i10++;
            }
        }
        return i10;
    }

    private static int[] getAdaptiveAudioTracks(TrackGroup trackGroup, int[] iArr, boolean z10) {
        String str;
        int adaptiveAudioTrackCount;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        AudioConfigurationTuple audioConfigurationTuple = null;
        for (int i11 = 0; i11 < trackGroup.length; i11++) {
            Format format = trackGroup.getFormat(i11);
            int i12 = format.channelCount;
            int i13 = format.sampleRate;
            if (z10) {
                str = null;
            } else {
                str = format.sampleMimeType;
            }
            AudioConfigurationTuple audioConfigurationTuple2 = new AudioConfigurationTuple(i12, i13, str);
            if (hashSet.add(audioConfigurationTuple2) && (adaptiveAudioTrackCount = getAdaptiveAudioTrackCount(trackGroup, iArr, audioConfigurationTuple2)) > i10) {
                i10 = adaptiveAudioTrackCount;
                audioConfigurationTuple = audioConfigurationTuple2;
            }
        }
        if (i10 > 1) {
            int[] iArr2 = new int[i10];
            int i14 = 0;
            for (int i15 = 0; i15 < trackGroup.length; i15++) {
                if (isSupportedAdaptiveAudioTrack(trackGroup.getFormat(i15), iArr[i15], (AudioConfigurationTuple) Assertions.checkNotNull(audioConfigurationTuple))) {
                    iArr2[i14] = i15;
                    i14++;
                }
            }
            return iArr2;
        }
        return NO_TRACKS;
    }

    private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int intValue = list.get(i15).intValue();
            if (isSupportedAdaptiveVideoTrack(trackGroup.getFormat(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    private static int[] getAdaptiveVideoTracksForGroup(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        String str;
        int adaptiveVideoTrackCountForMimeType;
        if (trackGroup.length < 2) {
            return NO_TRACKS;
        }
        List<Integer> viewportFilteredTrackIndices = getViewportFilteredTrackIndices(trackGroup, i14, i15, z11);
        if (viewportFilteredTrackIndices.size() < 2) {
            return NO_TRACKS;
        }
        if (!z10) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i16 = 0;
            for (int i17 = 0; i17 < viewportFilteredTrackIndices.size(); i17++) {
                String str3 = trackGroup.getFormat(viewportFilteredTrackIndices.get(i17).intValue()).sampleMimeType;
                if (hashSet.add(str3) && (adaptiveVideoTrackCountForMimeType = getAdaptiveVideoTrackCountForMimeType(trackGroup, iArr, i10, str3, i11, i12, i13, viewportFilteredTrackIndices)) > i16) {
                    i16 = adaptiveVideoTrackCountForMimeType;
                    str2 = str3;
                }
            }
            str = str2;
        } else {
            str = null;
        }
        filterAdaptiveVideoTrackCountForMimeType(trackGroup, iArr, i10, str, i11, i12, i13, viewportFilteredTrackIndices);
        if (viewportFilteredTrackIndices.size() < 2) {
            return NO_TRACKS;
        }
        return Util.toArray(viewportFilteredTrackIndices);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r1 != r3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> getViewportFilteredTrackIndices(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(trackGroup.length);
        for (int i13 = 0; i13 < trackGroup.length; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < trackGroup.length; i15++) {
                Format format = trackGroup.getFormat(i15);
                int i16 = format.width;
                if (i16 > 0 && (i12 = format.height) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z10, i10, i11, i16, i12);
                    int i17 = format.width;
                    int i18 = format.height;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i18 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int pixelCount = trackGroup.getFormat(((Integer) arrayList.get(size)).intValue()).getPixelCount();
                    if (pixelCount == -1 || pixelCount > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isSupported(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    private static boolean isSupportedAdaptiveAudioTrack(Format format, int i10, AudioConfigurationTuple audioConfigurationTuple) {
        if (!isSupported(i10, false) || format.channelCount != audioConfigurationTuple.channelCount || format.sampleRate != audioConfigurationTuple.sampleRate) {
            return false;
        }
        String str = audioConfigurationTuple.mimeType;
        if (str != null && !TextUtils.equals(str, format.sampleMimeType)) {
            return false;
        }
        return true;
    }

    private static boolean isSupportedAdaptiveVideoTrack(Format format, String str, int i10, int i11, int i12, int i13, int i14) {
        if (!isSupported(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !Util.areEqual(format.sampleMimeType, str)) {
            return false;
        }
        int i15 = format.width;
        if (i15 != -1 && i15 > i12) {
            return false;
        }
        int i16 = format.height;
        if (i16 != -1 && i16 > i13) {
            return false;
        }
        int i17 = format.bitrate;
        if (i17 != -1 && i17 > i14) {
            return false;
        }
        return true;
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, TrackSelection[] trackSelectionArr, int i10) {
        boolean z10;
        if (i10 == 0) {
            return;
        }
        boolean z11 = false;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < mappedTrackInfo.getRendererCount(); i13++) {
            int rendererType = mappedTrackInfo.getRendererType(i13);
            TrackSelection trackSelection = trackSelectionArr[i13];
            if ((rendererType == 1 || rendererType == 2) && trackSelection != null && rendererSupportsTunneling(iArr[i13], mappedTrackInfo.getTrackGroups(i13), trackSelection)) {
                if (rendererType == 1) {
                    if (i12 == -1) {
                        i12 = i13;
                    } else {
                        z10 = false;
                        break;
                    }
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i13;
                }
            }
        }
        z10 = true;
        if (i12 != -1 && i11 != -1) {
            z11 = true;
        }
        if (z10 & z11) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(i10);
            rendererConfigurationArr[i12] = rendererConfiguration;
            rendererConfigurationArr[i11] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, TrackSelection trackSelection) {
        if (trackSelection == null) {
            return false;
        }
        int indexOf = trackGroupArray.indexOf(trackSelection.getTrackGroup());
        for (int i10 = 0; i10 < trackSelection.length(); i10++) {
            if ((iArr[indexOf][trackSelection.getIndexInTrackGroup(i10)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    private static TrackSelection selectAdaptiveVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        int i11;
        boolean z10;
        if (parameters.allowNonSeamlessAdaptiveness) {
            i11 = 24;
        } else {
            i11 = 16;
        }
        if (parameters.allowMixedMimeAdaptiveness && (i10 & i11) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup = trackGroupArray.get(i12);
            int[] adaptiveVideoTracksForGroup = getAdaptiveVideoTracksForGroup(trackGroup, iArr[i12], z10, i11, parameters.maxVideoWidth, parameters.maxVideoHeight, parameters.maxVideoBitrate, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            if (adaptiveVideoTracksForGroup.length > 0) {
                return ((TrackSelection.Factory) Assertions.checkNotNull(factory)).createTrackSelection(trackGroup, adaptiveVideoTracksForGroup);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (compareFormatValues(r2.bitrate, r10) < 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection selectFixedVideoTrack(com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray r18, int[][] r19, com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.Parameters r20) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.selectFixedVideoTrack(com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray, int[][], com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection");
    }

    public ParametersBuilder buildUponParameters() {
        return getParameters().buildUpon();
    }

    public final void clearSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
        setParameters(buildUponParameters().clearSelectionOverride(i10, trackGroupArray));
    }

    public final void clearSelectionOverrides(int i10) {
        setParameters(buildUponParameters().clearSelectionOverrides(i10));
    }

    public Parameters getParameters() {
        return this.parametersReference.get();
    }

    public final boolean getRendererDisabled(int i10) {
        return getParameters().getRendererDisabled(i10);
    }

    public final SelectionOverride getSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
        return getParameters().getSelectionOverride(i10, trackGroupArray);
    }

    public final boolean hasSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
        return getParameters().hasSelectionOverride(i10, trackGroupArray);
    }

    public TrackSelection[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        TrackSelection.Factory factory;
        int rendererCount = mappedTrackInfo.getRendererCount();
        TrackSelection[] trackSelectionArr = new TrackSelection[rendererCount];
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            boolean z12 = true;
            if (i10 >= rendererCount) {
                break;
            }
            if (2 == mappedTrackInfo.getRendererType(i10)) {
                if (!z10) {
                    TrackSelection selectVideoTrack = selectVideoTrack(mappedTrackInfo.getTrackGroups(i10), iArr[i10], iArr2[i10], parameters, this.adaptiveTrackSelectionFactory);
                    trackSelectionArr[i10] = selectVideoTrack;
                    if (selectVideoTrack != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (mappedTrackInfo.getTrackGroups(i10).length <= 0) {
                    z12 = false;
                }
                z11 |= z12;
            }
            i10++;
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i11 = 0; i11 < rendererCount; i11++) {
            int rendererType = mappedTrackInfo.getRendererType(i11);
            if (rendererType != 1) {
                if (rendererType != 2) {
                    if (rendererType != 3) {
                        trackSelectionArr[i11] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i11), iArr[i11], parameters);
                    } else if (!z14) {
                        TrackSelection selectTextTrack = selectTextTrack(mappedTrackInfo.getTrackGroups(i11), iArr[i11], parameters);
                        trackSelectionArr[i11] = selectTextTrack;
                        if (selectTextTrack != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                }
            } else if (!z13) {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i11);
                int[][] iArr3 = iArr[i11];
                int i12 = iArr2[i11];
                if (z11) {
                    factory = null;
                } else {
                    factory = this.adaptiveTrackSelectionFactory;
                }
                TrackSelection selectAudioTrack = selectAudioTrack(trackGroups, iArr3, i12, parameters, factory);
                trackSelectionArr[i11] = selectAudioTrack;
                if (selectAudioTrack != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
        }
        return trackSelectionArr;
    }

    public TrackSelection selectAudioTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        int i11 = -1;
        int i12 = -1;
        AudioTrackScore audioTrackScore = null;
        for (int i13 = 0; i13 < trackGroupArray.length; i13++) {
            TrackGroup trackGroup = trackGroupArray.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroup.length; i14++) {
                if (isSupported(iArr2[i14], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    AudioTrackScore audioTrackScore2 = new AudioTrackScore(trackGroup.getFormat(i14), parameters, iArr2[i14]);
                    if (audioTrackScore == null || audioTrackScore2.compareTo(audioTrackScore) > 0) {
                        i11 = i13;
                        i12 = i14;
                        audioTrackScore = audioTrackScore2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup trackGroup2 = trackGroupArray.get(i11);
        if (!parameters.forceLowestBitrate && factory != null) {
            int[] adaptiveAudioTracks = getAdaptiveAudioTracks(trackGroup2, iArr[i11], parameters.allowMixedMimeAdaptiveness);
            if (adaptiveAudioTracks.length > 0) {
                return factory.createTrackSelection(trackGroup2, adaptiveAudioTracks);
            }
        }
        return new FixedTrackSelection(trackGroup2, i12);
    }

    public TrackSelection selectOtherTrack(int i10, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        boolean z10;
        TrackGroup trackGroup = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroupArray.length; i13++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroup2.length; i14++) {
                if (isSupported(iArr2[i14], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    int i15 = 1;
                    if ((trackGroup2.getFormat(i14).selectionFlags & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i15 = 2;
                    }
                    if (isSupported(iArr2[i14], false)) {
                        i15 += 1000;
                    }
                    if (i15 > i12) {
                        trackGroup = trackGroup2;
                        i11 = i14;
                        i12 = i15;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new FixedTrackSelection(trackGroup, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackSelection selectTextTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        byte b3;
        byte b10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        TrackGroup trackGroup = null;
        for (int i13 = 0; i13 < trackGroupArray.length; i13++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroup2.length; i14++) {
                if (isSupported(iArr2[i14], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    Format format = trackGroup2.getFormat(i14);
                    int i15 = format.selectionFlags & (~parameters.disabledTextTrackSelectionFlags);
                    int i16 = 1;
                    if ((i15 & 1) != 0) {
                        b3 = true;
                    } else {
                        b3 = false;
                    }
                    if ((i15 & 2) != 0) {
                        b10 = true;
                    } else {
                        b10 = false;
                    }
                    boolean formatHasLanguage = formatHasLanguage(format, parameters.preferredTextLanguage);
                    if (!formatHasLanguage && (!parameters.selectUndeterminedTextLanguage || !formatHasNoLanguage(format))) {
                        if (b3 != false) {
                            i16 = 3;
                        } else if (b10 != false) {
                            if (formatHasLanguage(format, parameters.preferredAudioLanguage)) {
                                i16 = 2;
                            }
                        }
                    } else {
                        if (b3 != false) {
                            i10 = 8;
                        } else if (b10 == false) {
                            i10 = 6;
                        } else {
                            i10 = 4;
                        }
                        i16 = i10 + (formatHasLanguage ? 1 : 0);
                    }
                    if (isSupported(iArr2[i14], false)) {
                        i16 += 1000;
                    }
                    if (i16 > i12) {
                        trackGroup = trackGroup2;
                        i11 = i14;
                        i12 = i16;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new FixedTrackSelection(trackGroup, i11);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2) throws ExoPlaybackException {
        boolean z10;
        RendererConfiguration rendererConfiguration;
        Parameters parameters = this.parametersReference.get();
        int rendererCount = mappedTrackInfo.getRendererCount();
        TrackSelection[] selectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        for (int i10 = 0; i10 < rendererCount; i10++) {
            if (parameters.getRendererDisabled(i10)) {
                selectAllTracks[i10] = null;
            } else {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i10);
                if (parameters.hasSelectionOverride(i10, trackGroups)) {
                    SelectionOverride selectionOverride = parameters.getSelectionOverride(i10, trackGroups);
                    if (selectionOverride == null) {
                        selectAllTracks[i10] = null;
                    } else if (selectionOverride.length == 1) {
                        selectAllTracks[i10] = new FixedTrackSelection(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks[0]);
                    } else {
                        selectAllTracks[i10] = ((TrackSelection.Factory) Assertions.checkNotNull(this.adaptiveTrackSelectionFactory)).createTrackSelection(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks);
                    }
                }
            }
        }
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i11 = 0; i11 < rendererCount; i11++) {
            if (!parameters.getRendererDisabled(i11) && (mappedTrackInfo.getRendererType(i11) == 5 || selectAllTracks[i11] != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                rendererConfiguration = RendererConfiguration.DEFAULT;
            } else {
                rendererConfiguration = null;
            }
            rendererConfigurationArr[i11] = rendererConfiguration;
        }
        maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, selectAllTracks, parameters.tunnelingAudioSessionId);
        return Pair.create(rendererConfigurationArr, selectAllTracks);
    }

    public TrackSelection selectVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        TrackSelection trackSelection;
        if (!parameters.forceLowestBitrate && factory != null) {
            trackSelection = selectAdaptiveVideoTrack(trackGroupArray, iArr, i10, parameters, factory);
        } else {
            trackSelection = null;
        }
        if (trackSelection == null) {
            return selectFixedVideoTrack(trackGroupArray, iArr, parameters);
        }
        return trackSelection;
    }

    public void setParameters(Parameters parameters) {
        Assertions.checkNotNull(parameters);
        if (this.parametersReference.getAndSet(parameters).equals(parameters)) {
            return;
        }
        invalidate();
    }

    public final void setRendererDisabled(int i10, boolean z10) {
        setParameters(buildUponParameters().setRendererDisabled(i10, z10));
    }

    public final void setSelectionOverride(int i10, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
        setParameters(buildUponParameters().setSelectionOverride(i10, trackGroupArray, selectionOverride));
    }

    public void setTunnelingAudioSessionId(int i10) {
        setParameters(buildUponParameters().setTunnelingAudioSessionId(i10));
    }

    public DefaultTrackSelector(BandwidthMeter bandwidthMeter) {
        this(new AdaptiveTrackSelection.Factory(bandwidthMeter));
    }

    public final void clearSelectionOverrides() {
        setParameters(buildUponParameters().clearSelectionOverrides());
    }

    public DefaultTrackSelector(TrackSelection.Factory factory) {
        this.adaptiveTrackSelectionFactory = factory;
        this.parametersReference = new AtomicReference<>(Parameters.DEFAULT);
    }

    public void setParameters(ParametersBuilder parametersBuilder) {
        setParameters(parametersBuilder.build());
    }

    /* loaded from: classes4.dex */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new Parcelable.Creator<SelectionOverride>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride[] newArray(int i10) {
                return new SelectionOverride[i10];
            }
        };
        public final int groupIndex;
        public final int length;
        public final int[] tracks;

        public SelectionOverride(int i10, int... iArr) {
            this.groupIndex = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = copyOf;
            this.length = iArr.length;
            Arrays.sort(copyOf);
        }

        public final boolean containsTrack(int i10) {
            for (int i11 : this.tracks) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.tracks) + (this.groupIndex * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.groupIndex);
            parcel.writeInt(this.tracks.length);
            parcel.writeIntArray(this.tracks);
        }

        public SelectionOverride(Parcel parcel) {
            this.groupIndex = parcel.readInt();
            int readByte = parcel.readByte();
            this.length = readByte;
            int[] iArr = new int[readByte];
            this.tracks = iArr;
            parcel.readIntArray(iArr);
        }
    }
}
