package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
abstract class Atom {
    public static final int DEFINES_LARGE_SIZE = 1;
    public static final int EXTENDS_TO_END_SIZE = 0;
    public static final int FULL_HEADER_SIZE = 12;
    public static final int HEADER_SIZE = 8;
    public static final int LONG_HEADER_SIZE = 16;
    public final int type;
    public static final int TYPE_ftyp = Util.getIntegerCodeForString("ftyp");
    public static final int TYPE_avc1 = Util.getIntegerCodeForString("avc1");
    public static final int TYPE_avc3 = Util.getIntegerCodeForString("avc3");
    public static final int TYPE_hvc1 = Util.getIntegerCodeForString("hvc1");
    public static final int TYPE_hev1 = Util.getIntegerCodeForString("hev1");
    public static final int TYPE_s263 = Util.getIntegerCodeForString("s263");
    public static final int TYPE_d263 = Util.getIntegerCodeForString("d263");
    public static final int TYPE_mdat = Util.getIntegerCodeForString("mdat");
    public static final int TYPE_mp4a = Util.getIntegerCodeForString("mp4a");
    public static final int TYPE__mp3 = Util.getIntegerCodeForString(".mp3");
    public static final int TYPE_wave = Util.getIntegerCodeForString("wave");
    public static final int TYPE_lpcm = Util.getIntegerCodeForString("lpcm");
    public static final int TYPE_sowt = Util.getIntegerCodeForString("sowt");
    public static final int TYPE_ac_3 = Util.getIntegerCodeForString("ac-3");
    public static final int TYPE_dac3 = Util.getIntegerCodeForString("dac3");
    public static final int TYPE_ec_3 = Util.getIntegerCodeForString("ec-3");
    public static final int TYPE_dec3 = Util.getIntegerCodeForString("dec3");
    public static final int TYPE_dtsc = Util.getIntegerCodeForString("dtsc");
    public static final int TYPE_dtsh = Util.getIntegerCodeForString("dtsh");
    public static final int TYPE_dtsl = Util.getIntegerCodeForString("dtsl");
    public static final int TYPE_dtse = Util.getIntegerCodeForString("dtse");
    public static final int TYPE_ddts = Util.getIntegerCodeForString("ddts");
    public static final int TYPE_tfdt = Util.getIntegerCodeForString("tfdt");
    public static final int TYPE_tfhd = Util.getIntegerCodeForString("tfhd");
    public static final int TYPE_trex = Util.getIntegerCodeForString("trex");
    public static final int TYPE_trun = Util.getIntegerCodeForString("trun");
    public static final int TYPE_sidx = Util.getIntegerCodeForString("sidx");
    public static final int TYPE_moov = Util.getIntegerCodeForString("moov");
    public static final int TYPE_mvhd = Util.getIntegerCodeForString("mvhd");
    public static final int TYPE_trak = Util.getIntegerCodeForString("trak");
    public static final int TYPE_mdia = Util.getIntegerCodeForString("mdia");
    public static final int TYPE_minf = Util.getIntegerCodeForString("minf");
    public static final int TYPE_stbl = Util.getIntegerCodeForString("stbl");
    public static final int TYPE_avcC = Util.getIntegerCodeForString("avcC");
    public static final int TYPE_hvcC = Util.getIntegerCodeForString("hvcC");
    public static final int TYPE_esds = Util.getIntegerCodeForString("esds");
    public static final int TYPE_moof = Util.getIntegerCodeForString("moof");
    public static final int TYPE_traf = Util.getIntegerCodeForString("traf");
    public static final int TYPE_mvex = Util.getIntegerCodeForString("mvex");
    public static final int TYPE_mehd = Util.getIntegerCodeForString("mehd");
    public static final int TYPE_tkhd = Util.getIntegerCodeForString("tkhd");
    public static final int TYPE_edts = Util.getIntegerCodeForString("edts");
    public static final int TYPE_elst = Util.getIntegerCodeForString("elst");
    public static final int TYPE_mdhd = Util.getIntegerCodeForString("mdhd");
    public static final int TYPE_hdlr = Util.getIntegerCodeForString("hdlr");
    public static final int TYPE_stsd = Util.getIntegerCodeForString("stsd");
    public static final int TYPE_pssh = Util.getIntegerCodeForString("pssh");
    public static final int TYPE_sinf = Util.getIntegerCodeForString("sinf");
    public static final int TYPE_schm = Util.getIntegerCodeForString("schm");
    public static final int TYPE_schi = Util.getIntegerCodeForString("schi");
    public static final int TYPE_tenc = Util.getIntegerCodeForString("tenc");
    public static final int TYPE_encv = Util.getIntegerCodeForString("encv");
    public static final int TYPE_enca = Util.getIntegerCodeForString("enca");
    public static final int TYPE_frma = Util.getIntegerCodeForString("frma");
    public static final int TYPE_saiz = Util.getIntegerCodeForString("saiz");
    public static final int TYPE_saio = Util.getIntegerCodeForString("saio");
    public static final int TYPE_sbgp = Util.getIntegerCodeForString("sbgp");
    public static final int TYPE_sgpd = Util.getIntegerCodeForString("sgpd");
    public static final int TYPE_uuid = Util.getIntegerCodeForString("uuid");
    public static final int TYPE_senc = Util.getIntegerCodeForString("senc");
    public static final int TYPE_pasp = Util.getIntegerCodeForString("pasp");
    public static final int TYPE_TTML = Util.getIntegerCodeForString("TTML");
    public static final int TYPE_vmhd = Util.getIntegerCodeForString("vmhd");
    public static final int TYPE_mp4v = Util.getIntegerCodeForString("mp4v");
    public static final int TYPE_stts = Util.getIntegerCodeForString("stts");
    public static final int TYPE_stss = Util.getIntegerCodeForString("stss");
    public static final int TYPE_ctts = Util.getIntegerCodeForString("ctts");
    public static final int TYPE_stsc = Util.getIntegerCodeForString("stsc");
    public static final int TYPE_stsz = Util.getIntegerCodeForString("stsz");
    public static final int TYPE_stz2 = Util.getIntegerCodeForString("stz2");
    public static final int TYPE_stco = Util.getIntegerCodeForString("stco");
    public static final int TYPE_co64 = Util.getIntegerCodeForString("co64");
    public static final int TYPE_tx3g = Util.getIntegerCodeForString("tx3g");
    public static final int TYPE_wvtt = Util.getIntegerCodeForString("wvtt");
    public static final int TYPE_stpp = Util.getIntegerCodeForString("stpp");
    public static final int TYPE_c608 = Util.getIntegerCodeForString("c608");
    public static final int TYPE_samr = Util.getIntegerCodeForString("samr");
    public static final int TYPE_sawb = Util.getIntegerCodeForString("sawb");
    public static final int TYPE_udta = Util.getIntegerCodeForString("udta");
    public static final int TYPE_meta = Util.getIntegerCodeForString("meta");
    public static final int TYPE_ilst = Util.getIntegerCodeForString("ilst");
    public static final int TYPE_mean = Util.getIntegerCodeForString("mean");
    public static final int TYPE_name = Util.getIntegerCodeForString("name");
    public static final int TYPE_data = Util.getIntegerCodeForString(DataSchemeDataSource.SCHEME_DATA);
    public static final int TYPE_emsg = Util.getIntegerCodeForString("emsg");
    public static final int TYPE_st3d = Util.getIntegerCodeForString("st3d");
    public static final int TYPE_sv3d = Util.getIntegerCodeForString("sv3d");
    public static final int TYPE_proj = Util.getIntegerCodeForString("proj");
    public static final int TYPE_vp08 = Util.getIntegerCodeForString("vp08");
    public static final int TYPE_vp09 = Util.getIntegerCodeForString("vp09");
    public static final int TYPE_vpcC = Util.getIntegerCodeForString("vpcC");
    public static final int TYPE_camm = Util.getIntegerCodeForString("camm");
    public static final int TYPE_alac = Util.getIntegerCodeForString("alac");

    /* loaded from: classes3.dex */
    public static final class ContainerAtom extends Atom {
        public final List<ContainerAtom> containerChildren;
        public final long endPosition;
        public final List<LeafAtom> leafChildren;

        public ContainerAtom(int i9, long j7) {
            super(i9);
            this.endPosition = j7;
            this.leafChildren = new ArrayList();
            this.containerChildren = new ArrayList();
        }

        public final void add(LeafAtom leafAtom) {
            this.leafChildren.add(leafAtom);
        }

        public final int getChildAtomOfTypeCount(int i9) {
            int size = this.leafChildren.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (this.leafChildren.get(i11).type == i9) {
                    i10++;
                }
            }
            int size2 = this.containerChildren.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (this.containerChildren.get(i12).type == i9) {
                    i10++;
                }
            }
            return i10;
        }

        public final ContainerAtom getContainerAtomOfType(int i9) {
            int size = this.containerChildren.size();
            for (int i10 = 0; i10 < size; i10++) {
                ContainerAtom containerAtom = this.containerChildren.get(i10);
                if (containerAtom.type == i9) {
                    return containerAtom;
                }
            }
            return null;
        }

        public final LeafAtom getLeafAtomOfType(int i9) {
            int size = this.leafChildren.size();
            for (int i10 = 0; i10 < size; i10++) {
                LeafAtom leafAtom = this.leafChildren.get(i10);
                if (leafAtom.type == i9) {
                    return leafAtom;
                }
            }
            return null;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom
        public final String toString() {
            return Atom.getAtomTypeString(this.type) + " leaves: " + Arrays.toString(this.leafChildren.toArray()) + " containers: " + Arrays.toString(this.containerChildren.toArray());
        }

        public final void add(ContainerAtom containerAtom) {
            this.containerChildren.add(containerAtom);
        }
    }

    /* loaded from: classes3.dex */
    public static final class LeafAtom extends Atom {
        public final ParsableByteArray data;

        public LeafAtom(int i9, ParsableByteArray parsableByteArray) {
            super(i9);
            this.data = parsableByteArray;
        }
    }

    public Atom(int i9) {
        this.type = i9;
    }

    public static String getAtomTypeString(int i9) {
        return "" + ((char) ((i9 >> 24) & 255)) + ((char) ((i9 >> 16) & 255)) + ((char) ((i9 >> 8) & 255)) + ((char) (i9 & 255));
    }

    public static int parseFullAtomFlags(int i9) {
        return i9 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int parseFullAtomVersion(int i9) {
        return (i9 >> 24) & 255;
    }

    public String toString() {
        return getAtomTypeString(this.type);
    }
}
