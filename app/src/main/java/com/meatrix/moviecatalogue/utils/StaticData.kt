package com.meatrix.moviecatalogue.utils

import com.meatrix.moviecatalogue.data.MovieEntity
import com.meatrix.moviecatalogue.data.TvShowEntity
import com.meatrix.moviecatalogue.R

object StaticData {
    fun generateMovie() : List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                "1",
                "Avengers: Infinity War",
                "April 25,2018",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this momentthe fate of Earth and existence itself has never been more uncertain.",
                R.drawable.avenger
            )
        )
        movies.add(
            MovieEntity(
                "2",
                "Aquaman",
                "December 7,2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orms half-human, half-Atlantean brother and true heir to the throne.",
                R.drawable.aquaman
            )
        )
        movies.add(
            MovieEntity(
                "3",
                "Black Panther",
                "February 13,2018",
                "King TChalla returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his countrys new leader. However, TChalla soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, TChalla assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan special forces) and an American secret agent, to prevent Wakanda from being dragged into a world war.",
                R.drawable.blackpanther
            )
        )
        movies.add(
            MovieEntity(
                "4",
                "BumbleBee",
                "December 15,2018",
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                R.drawable.bumblebee
            )
        )
        movies.add(
            MovieEntity(
                "5",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "November 14,2018",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                R.drawable.fantasticbeast
            )
        )
        movies.add(
            MovieEntity(
                "6",
                "Ralph Breaks the Internet",
                "November 20,2018",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellopes video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet -the netizens-  to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                R.drawable.ralph
            )
        )
        movies.add(
            MovieEntity(
                "7",
                "Re: Zero kara Hajimeru Isekai Seikatsu - Memory Snow",
                "October 6,2018",
                "Subaru and friends finally get a moment of peace, and Subaru goes on a certain secret mission that he must not let anyone find out about! However, even though Subaru is wearing a disguise, Petra and other children of the village immediately figure out who he is. Now that his mission was exposed within five seconds of it starting, what will happen with Subaru date course with Emilia?",
                R.drawable.re_zero
            )
        )
        movies.add(
            MovieEntity(
                "8",
                "Robin Hood",
                "November 21,2018",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                R.drawable.robinhood
            )
        )
        movies.add(
            MovieEntity(
                "9",
                "Spider-Man: Into Spider-Verse",
                "December 6,2018",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson/Kingpin Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                R.drawable.spiderman
            )
        )
        movies.add(
            MovieEntity(
                "10",
                "Venom",
                "September 28,2018",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                R.drawable.venom
            )
        )
        return movies
    }

    fun generateTv() : List<TvShowEntity>{
        val tv = ArrayList<TvShowEntity>()

        tv.add(
            TvShowEntity(
            "1",
            "Arrow",
                "2012",
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            R.drawable.arrow
            )
        )

        tv.add(
            TvShowEntity(
            "2",
                "Dragon Ball",
                "1986",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku home. Together, they set off to find all seven dragon balls in an adventure.",
                R.drawable.dragonball
            )
        )

        tv.add(
            TvShowEntity(
                "3",
                "Fairy Tail",
                "2009",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isnt just any ordinary kid, he is a member of one of the worlds most infamous mage guilds: Fairy Tail.",
                R.drawable.fairytail
            )
        )

        tv.add(
            TvShowEntity(
                "4",
                "Gotham",
                "2014",
                "Before there was Batman, there was GOTHAM. \n Everyone knows the name Commissioner Gordon. He is one of the crime worlds greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the worlds most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                R.drawable.gotham
            )
        )

        tv.add(
            TvShowEntity(
                "5",
                "Marvels Iron Fist",
                "2017",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                R.drawable.ironfist
            )
        )

        tv.add(
            TvShowEntity(
                "6",
                "Naruto Shippuden",
                "2007",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                R.drawable.narutoshipudden
            )
        )

        tv.add(
            TvShowEntity(
                "7",
                "Supergirl",
                "2015",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                R.drawable.supergirl
            )
        )

        tv.add(
            TvShowEntity(
                "8",
                "The Flash",
                "2014",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only -meta-human- who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it wont be long before the world learns what Barry Allen has become...The Flash.",
                R.drawable.flash
            )
        )

        tv.add(
            TvShowEntity(
                "9",
                "The Simpsons",
                "1989",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                R.drawable.thesimpson
            )
        )

        tv.add(
            TvShowEntity(
                "10",
                "The Walking Dead",
                "2010",
                "Sheriffs deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                R.drawable.thewalkingdead
            )
        )
        return tv
    }
}