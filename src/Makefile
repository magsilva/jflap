SOURCEDIRS = automata file grammar gui regular pumping debug
APACHE = org
AUX = DOCS ICON MEDIA Makefile mainFile README LICENSE ChangeLog.txt JFLAP.class

all: source-included ws two-jar
	rm build


source-included: build
	find $(SOURCEDIRS)  -name "*.class" -o -name "*.java" > OUTYOUTY
	jar cmf mainFile JFLAP_With_Source.jar @OUTYOUTY $(AUX) $(APACHE)
	rm OUTYOUTY

without-source ws: build
	find $(SOURCEDIRS)  -name "*.class" > OUTYOUTY
	jar cmf mainFile JFLAP.jar @OUTYOUTY $(AUX) $(APACHE)
	rm OUTYOUTY

two-jar: build
	find $(SOURCEDIRS) -name "*.class" > OUTYOUTY
	jar cmf mainFile JFLAP_Thin.jar @OUTYOUTY $(AUX)
	rm OUTYOUTY
	jar cf svg.jar org

build:
	find . -name "*.java" | xargs javac 
#	find $(SOURCEDIRS) -name "*.java" | xargs javac 
	touch build

################################################################################

#jar:
#	find . -name "*.class" -o -name "*.java" > OUTYOUTY
#	jar cmf  mainFile JFLAP_With_Source.jar @OUTYOUTY $(AUX)
#	rm OUTYOUTY
#
#jar-ws:
#	find . -name "*.class" > OUTYOUTY
#	jar cmf mainFile JFLAP.jar @OUTYOUTY $(AUX)
#	rm OUTYOUTY
################################################################################
clean:
	find $(SOURCEDIRS) \( -name "*.class" -o -name "*~" -o -name ".DS_Store" \) \
		-a -delete
	rm -f JFLAP.jar
	rm -f build
	rm -f 
