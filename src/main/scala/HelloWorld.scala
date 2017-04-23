import com.mpatric.mp3agic.Mp3File

object HelloWorld {
    def main(args: Array[String]): Unit = {
        def boolean2String(b: Boolean, labelTrue:String = "YES", labelFalse:String = "NO") =
            if (b) labelTrue else labelFalse

        val filename = "/Users/Stan/Music/Express [BT Express].mp3"

        val mp3file = new Mp3File(filename)
        System.out.println("Length of this mp3 is: " + mp3file.getLengthInSeconds + " seconds")
        System.out.println("Bitrate: " + mp3file.getBitrate + " kbps (" + boolean2String(mp3file.isVbr, "VBR", "CBR") + ")")
        System.out.println("Sample rate: " + mp3file.getSampleRate + " Hz")
        System.out.println("Has ID3v1 tag?: " + boolean2String(mp3file.hasId3v1Tag))
        System.out.println("Has ID3v2 tag?: " + boolean2String(mp3file.hasId3v2Tag))
        System.out.println("Has custom tag?: " + boolean2String(mp3file.hasCustomTag))
    }
}
